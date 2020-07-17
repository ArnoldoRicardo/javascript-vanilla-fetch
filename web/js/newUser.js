/** @format */

// Eventos
document.getElementById('pais').onchange = function () {
    var paisId = document.getElementById('pais').value;
    clearData('estado');
    clearData('ciudad');
    getEstados(paisId);
};

document.getElementById('estado').onchange = function () {
    var estadoId = document.getElementById('estado').value;

    clearData('ciudad');
    getCiudad(estadoId);
};

document.querySelector('form').onsubmit = function (e) {
    e.preventDefault();

    var data = {
        ciudadId: document.getElementById('ciudad').value,
        nombre: document.getElementById('nombre').value,
        edad: document.getElementById('edad').value,
    };

    if (isValidate(data)) {
        saveData(data);
    } else {
        console.log('have errors');
    }
};

// validar datos
function isValidate(data) {
    datos = data;
    if (data.nombre.length > 50) {
        window.alert('El nombre debe de ser de 50 caracteres máximo');
        return false;
    }

    if (data.nombre.match(/^[0-9]+$/)) {
        window.alert('El nombre debe ser solo texto');
        return false;
    }

    if (data.edad < 18 || data.edad > 99) {
        window.alert('La edad debe ser entre 18 y 99 años');
        return false;
    }

    return true;
}

// populando dropdowns

function clearData(selector) {
    document.getElementById(selector).innerHTML = '';
    let pElem = document.createElement('option');
    pElem.textContent = 'Selecciona un valor';
    document.getElementById(selector).appendChild(pElem);
}

function addPais(paisID, pais) {
    let pElem = document.createElement('option');
    pElem.value = paisID;
    pElem.textContent = pais;
    document.getElementById('pais').appendChild(pElem);
}

function addEstado(estadoID, estado) {
    let pElem = document.createElement('option');
    pElem.value = estadoID;
    pElem.textContent = estado;
    document.getElementById('estado').appendChild(pElem);
}

function addCiudad(ciduadId, ciudad) {
    let pElem = document.createElement('option');
    pElem.value = ciduadId;
    pElem.textContent = ciudad;
    document.getElementById('ciudad').appendChild(pElem);
}

// obteniendo datos desde el server

function getPaises() {
    fetch('http://localhost:8080/servicio/paises', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
        },
    })
        .then((res) => res.json())
        .catch((error) => console.error('Error:', error))
        .then(function (response) {
            //console.log('Success:', response);
            response.forEach((element) => addPais(element.id, element.nombre));
        });
}

function getEstados(paisId) {
    fetch('http://localhost:8080/servicio/estados', {
        method: 'POST',
        body: paisId,
        headers: {
            'Content-Type': 'application/json',
        },
    })
        .then((res) => res.json())
        .catch((error) => console.error('Error:', error))
        .then(function (response) {
            //console.log('Success:', response);
            response.forEach((element) => addEstado(element.id, element.nombre));
        });
}

function getCiudad(estadoId) {
    fetch('http://localhost:8080/servicio/ciudades', {
        method: 'POST',
        body: estadoId,
        headers: {
            'Content-Type': 'application/json',
        },
    })
        .then((res) => res.json())
        .catch((error) => console.error('Error:', error))
        .then(function (response) {
            //console.log('Success:', response);
            response.forEach((element) => addCiudad(element.id, element.nombre));
        });
}

function saveData(data) {
    console.log(data);

    fetch('http://localhost:8080/servicio/guardar', {
        method: 'POST',
        body: JSON.stringify(data),
        headers: {
            'Content-Type': 'application/json',
        },
    })
        .then((res) => res.json())
        .catch((error) => console.error('Error:', error))
        .then(function (response) {
            console.log('Success:', response);
            document.querySelector('body').innerHTML =
                '<h1>' +
                response.resultado +
                '</h1><a href="javascript:location.reload()">Regresar</a>';
        });
}

getPaises();

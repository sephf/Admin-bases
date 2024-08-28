<template>
  <div>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
      <div class="container-fluid">
        <a class="navbar-brand">Gimnasio</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <router-link to="/" class="nav-link">Inicio</router-link>
            </li>
            <li class="nav-item">
              <router-link to="/contactos" class="nav-link">Contactos</router-link>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                Servicios
              </a>
              <ul class="dropdown-menu">
                <li><router-link to="/servicios/inscripcion" class="dropdown-item">Inscripción</router-link></li>
                <li><router-link to="/servicios/cursos" class="dropdown-item">Cursos</router-link></li>
                <li><router-link to="/servicios/maquinas" class="dropdown-item">Máquinas</router-link></li>
                <li><router-link to="/servicios/instructores" class="dropdown-item">Instructores</router-link></li>
              </ul>
            </li>
            <li class="nav-item">
              <router-link to="/ingreso" class="nav-link">Ingreso</router-link>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <img alt="Vue logo" src="./assets/logo.png">
    <router-view></router-view>
  </div>
  <div>
    <h1>Conexión con el Servidor Express</h1>
    <button @click="obtenerMensaje">Obtener Mensaje</button>
    <p>{{ mensaje }}</p>
    <button @click="enviarDatos">Enviar Datos</button>
  </div>
</template>

<script>
export default {
  name: 'App',
  data(){
    return{
      mensaje:'',
    };
  },
  methods: {
    obtenerMensaje() {
      fetch('http://localhost:3000/api/mensaje')
        .then(response => response.json())
        .then(data => {
          console.log(data);
          this.mensaje = data.message;
        })
        .catch(error => {
          console.error('Error:', error);
        });
    },
    enviarDatos() {
      fetch('http://localhost:3000/api/datos', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({ nombre: 'Juan', edad: 30 }),
      })
        .then(response => response.json())
        .then(data => {
          console.log(data.message);
        })
        .catch(error => {
          console.error('Error:', error);
        });
    },
    mounted(){
      this.obtenerMensaje();
    },
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>

<template>
  <div>
    <NavBar/>
    <!--<img alt="Vue logo" src="./assets/logo.png">-->
    <router-view></router-view>
    <h1>Conexión con el Servidor Express</h1>
    <button @click="obtenerMensaje">Obtener Mensaje</button>
    <p>{{ mensaje }}</p>
    <button @click="enviarDatos">Enviar Datos</button>
  </div>
</template>

<script>
import NavBar from './components/NavBar.vue';

export default {
  name: 'App',
  components: {
    NavBar,
  },
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
  background: #6a11cb;
  background: -webkit-linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1));
  background: linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1));
  display: flex;
  flex-direction: column;
  min-height: 100vh;
}
</style>

import { createRouter, createWebHistory } from 'vue-router';
import AppIngreso from './components/AppIngreso.vue';
import Contactos from './components/AppContactos.vue';
import ServicioInscripcion from './components/servicios/ServicioInscripcion.vue';

const routes = [
  { path: '/contactos', component: Contactos, name: 'contactos' },
  { path: '/ingreso', component: AppIngreso, name: 'ingreso' },
  { path: '/servicios/inscripcion', component:ServicioInscripcion, name: 'inscripcion'},
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;

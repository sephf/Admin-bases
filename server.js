const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');
const app = express();
const path = require('path');
app.use(express.json());
const port = process.env.PORT || 3000;
app.use(express.static('public'));
app.use(cors());
app.use(bodyParser.json());


app.post('/api/datos', (req, res) => {
  const datos = req.body;
  console.log('Datos recibidos:', datos);
  res.json({ message: 'Datos recibidos correctamente' });
});

const cursos = [
  { id: 1, nombre: 'Curso 1' },
  { id: 2, nombre: 'Curso 2' },
  { id: 3, nombre: 'Curso 3' }
];

app.get('/api/cursos', (req, res) => {
  //res.send('Hola desde Express!');
  //res.render('ingreso', {title:'Ingreso'})
  res.json(cursos);
});
app.listen(port, () => {
  console.log(`Servidor corriendo en http://localhost:${port}`);
});

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

app.get('/api/mensaje', (req, res) => {
  //res.send('Hola desde Express!');
  //res.render('ingreso', {title:'Ingreso'})
  res.json({ message: 'Hello desde node!' });
});
app.post('/api/datos', (req, res) => {
  const datos = req.body;
  console.log('Datos recibidos:', datos);
  res.json({ message: 'Datos recibidos correctamente' });
});

app.listen(port, () => {
  console.log(`Servidor corriendo en http://localhost:${port}`);
});

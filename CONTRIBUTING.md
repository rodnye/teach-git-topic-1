
# Cómo contribuir 🛠️  
Para simplicidad, se utilizarán nomenclaturas y nombres en español, para seguir los estándares de la CUJAE  

## Ramas 🌿  
Todas los aportes al proyecto se harán en una rama independiente, siguiendo esta nomenclatura:  
```
tipo/nombre-en-kebab-case  
```

Estos son ejemplos de ramas válidas ✅:  
```
feat/panel-admin  
feat/facturas  
fix/bug-boton  
```

## Commits 💾  
Se usará una versión simplificada de Conventional Commits:  
```
tipo: mensaje en minúsculas principalmente  
```
El mensaje debe indicar una acción con un infinitivo (`añadir/eliminar/corregir/lanzar` etc):

```sh
# ✅ Correcto
feat: añadir botón cancelar en el formulario de facturas

# ❌ Incorrecto
feat: se ha añadido botón cancelar en el formulario de facturas
```

Otros ejemplos válidos 📝:  
```
chore: lanzar aplicación a producción
fix: solucionar problema de composición de los clientes (#4)  
refactor: renombrar clase FabricaQuesos a QuesoManager  
```

## Tipos 📌  
Estos van antes del nombre de una rama o antes de un commit. Los que usaremos serán los siguientes:  

- ✨ `feat`: Para nuevas funcionalidades o características  
- 🐛 `fix`: Para corrección de errores  
- ♻️ `refactor`: Para cambios de código que no corrigen errores ni añaden funcionalidades  
- 📚 `docs`: Para actualización o mejora de documentación  
- 🧪 `test`: Para añadir o modificar pruebas  
- 🔧 `chore`: Para tareas de mantenimiento o configuración

## Issues 📝🔗  
En las issues se estarán repartiendo las tareas de cada uno de los colaboradores:  
- Cada issue debe tener su etiqueta correspondiente
- Se asignará a un desarrollador 
- Debe hacer referencia al commit que lo solucione  

## Especificaciones para nombrar 📝⚙️  
- Todos los ID son String de 5 caracteres numéricos (0-9)  
- Todas las variables relacionadas a cálculos serán de tipo float  
- Todos los métodos para añadir serán `addObjeto` (ej: `addCliente`)  
- Todos los métodos para eliminar serán `removeObjeto` (ej: `removeProducto`)  
- Todos los métodos de búsqueda serán `findObjeto` (ej: `findFactura`)  


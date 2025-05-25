# Proyecto colaborativo para enseñar habilidades con Git

Ver como [contribuir](./CONTRIBUTING.md)

## Orientación
> DPOO Clase práctica No. 8 Curso 2024-2025

El Complejo Lácteo de La Habana comercializa unidades de queso según solicitudes
de los clientes. Está especializado en la fabricación de tres formas distintas: queso
esférico, queso cilíndrico y queso en forma de cilindro hueco, como se muestra en la
figura.

Dicha entidad requiere un sistema que procese de forma automática su actividad
comercial, esencialmente el cálculo del valor de cada unidad de queso, conociendo de
cada forma de queso el precio unitario (por unidad de volumen) y la medida de su
radio. Si la forma del queso es cilíndrica, se conoce su longitud y si es de forma
cilíndrica hueca, se conoce además el radio interior.

Para cada producto comercializado por el complejo, se tiene un precio base y se
conoce el precio unitario de cada tipo de queso.

El cálculo del precio total de un queso se realiza mediante la fórmula:

`Precio total = Precio base + Precio unitario * volumen`

Se lleva un registro de los clientes (otras empresas o entidades), y de cada uno se
conoce el número (consecutivo asignado por el Complejo), el nombre, dirección y
teléfono.

Para cada solicitud se confecciona una factura que contiene un código, los datos del
cliente, la fecha y un listado con los quesos vendidos (por tipos y dimensiones) y la
cantidad en cada caso.
Diseñe las clases necesarias para modelar la situación anterior utilizando un diagrama
de clases de UML.

Implemente métodos para:
1. Calcular el volumen de cada unidad de queso, conociendo que:
    - Esfera: `4/3 * pi * radio^3`
    - Cilindro: `pi * radio^2 * longitud`
    - Cilindro hueco: `pi * longitud * (radioe2 – radioi2) , radioe > radioi`
2. Calcular el monto total que debe ingresar la empresa por el pago de todas las
facturas.
3. Obtener la cantidad de unidades de queso facturadas de un tipo dado.
 Obtener el precio del queso esférico de mayor volumen producido.
4. Obtener los nombres de los clientes que han pedido la mayor cantidad total de
quesos.


## Modificaciones:
Además de la indicación, se tendrá el detalle de que los Quesos identifican lotes de producción por una FabricaQuesos.
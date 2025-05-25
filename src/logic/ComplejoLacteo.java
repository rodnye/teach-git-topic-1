    package logic;

    import java.util.ArrayList;
    import java.util.List;

    public class ComplejoLacteo {
        private ArrayList<Cliente> clientes;
        private ArrayList<Factura> facturas;
        
        public ComplejoLacteo() {
        this.clientes = new ArrayList<>();
        this.facturas = new ArrayList<>();
        }

        public void addClientes(Cliente cliente){
        if(cliente != null){
            clientes.add(cliente);
        } else{
            System.err.println("Error: El cliente no puede ser nulo");
        }
        }
        
        public Cliente getCliente(String id) {
        Cliente foundClient = null; 
        
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                foundClient = cliente;
            }
        }
        return foundClient; 
        }

        public ArrayList<Cliente> getAllClientes(){
        return clientes;
        }

        public void ActualizarCliente(String id, Cliente clienteActualizado){
        boolean actualizado = false;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                clientes.set(clientes.idexOf(cliente), clienteActualizado);
                actualizado = true;
            }
        }
        if (!actualizado) {
            System.err.println("Cliente con ID" + id + "no encontrado");
        }
        }
        
        public void deleteCliente(String id) {
        boolean removed = clientes.removeIf(cliente -> cliente.getId().equals(id));//Usa la expresion "->" para indicar que elementos deben borrarse
            if (!removed) {
            System.err.println("Error: Cliente con ID " + id + " no encontrado.");
        }
        }

        public void addFactura(Factura factura) {
            
            if (factura != null) {
                 facturas.add(factura);
                } else {
                    System.err.println("Error: La factura no puede ser nula.");
                 }
                }
                
        public Factura getFactura(String id) {
            Factura foundFactura = null;
            
            for (Factura factura : facturas) {
                if (factura.getId().equals(id)) {
                    foundFactura = factura;
                }
            }
            return foundFactura;
        }
        
        public ArrayList<Factura> getAllFacturas() {
            return facturas;}

        public void actualizarFactura(String id, Factura facturaActualizada) {
            boolean actualizado = false;
            
            for (Factura factura : facturas) {
                if (factura.getId().equals(id)) {
                    facturas.set(facturas.indexOf(factura), facturaActualizada);
                    actualizado = true;
                }
            }
            
            if (!actualizado) {
                System.err.println("Error: Factura con ID " + id + " no encontrada.");
            }
        }

        public void deleteFactura(String id) {
            boolean removed = facturas.removeIf(factura -> factura.getId().equals(id));
            
            if (!removed) {
                System.err.println("Error: Factura con ID " + id + " no encontrada.");
            }
        }
    
    }

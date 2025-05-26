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
            Cliente clienteEncontrado = null;
            boolean flag = false;
            int i = 0;
            
            while (i < clientes.size() && !flag) {
                if (clientes.get(i).getId().equals(id)) {
                    clienteEncontrado = clientes.get(i); 
                    flag = true;
            }
            i++;
        }
        return clienteEncontrado; 
        }
        
        public ArrayList<Cliente> getAllClientes(){
        return clientes;
        }

       public void actualizarCliente(String id, Cliente clienteActualizado) {
        int i = 0;
        boolean actualizado = false;
        while (i < clientes.size() && !actualizado) {
            if (clientes.get(i).getId().equals(id)) {
                clientes.set(i, clienteActualizado); 
                actualizado = true; 
                }
                i++;
            }
            if (!actualizado) {
                System.err.println("Cliente con ID " + id + " no encontrado");
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
            Factura facturaEncontrada = null;
            boolean flag = false;
            int i = 0;
            
            while (i < facturas.size() && !flag) {
                if (facturas.get(i).getId().equals(id)) {
                    facturaEncontrada = facturas.get(i); 
                    flag = true;
            }
            i++;
        }
        return facturaEncontrada; 
        }
        
        public ArrayList<Factura> getAllFacturas() {
            return facturas;
        }

        public void actualizarFactura(String id, Factura facturaActualizada) {
        int i = 0;
        boolean actualizado = false;
        while (i < facturas.size() && !actualizado) {
            if (facturas.get(i).getId().equals(id)) {
                facturas.set(i, facturaActualizada); 
                actualizado = true; 
                }
                i++;
            }
            if (!actualizado) {
                System.err.println("Factura con ID " + id + " no encontrada");
            }
        }

        public void deleteFactura(String id) {
            boolean removed = facturas.removeIf(factura -> factura.getId().equals(id));
            
            if (!removed) {
                System.err.println("Error: Factura con ID " + id + " no encontrada.");
            }
        }
    
    }

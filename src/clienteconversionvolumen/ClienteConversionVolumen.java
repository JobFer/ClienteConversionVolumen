package clienteconversionvolumen;

public class ClienteConversionVolumen {

    public static void main(String[] args) {
        System.out.println("Resultado: " + galonesALitros(1));
    }

    private static double galonesALitros(double galones) {
        clienteconversionvolumen.ConvertirUnidadesVolumenWS_Service service = new clienteconversionvolumen.ConvertirUnidadesVolumenWS_Service();
        clienteconversionvolumen.ConvertirUnidadesVolumenWS port = service.getConvertirUnidadesVolumenWSPort();
        return port.galonesALitros(galones);
    }
    
}

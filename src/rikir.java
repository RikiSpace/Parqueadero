import javax.swing.JOptionPane;
import java.lang.reflect.Array;

public class rikir {

    public static void main(String[] args) {
        String placa;
        double hora, resta , multi,horasalida, horaentrada;
        String placa;
        int tipo;
        int carro=1,moto=2;

        JOptionPane.showMessageDialog(null, "===========================================\n"+
                "Parqueadero RikiRiki \n" +
                "Valor hora o fraccion\n" +
                "Carro : 2000$ ---- Moto: 1000$ \n"+
                "===========================================\n");

        tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para agregar Carrro, 2 para agregar Moto y 3 para salir"));
        /*if (tipo == carro) {
            multi = Math.ceil(resta) * 2000;

            JOptionPane.showMessageDialog(null, "===========================================\n"+
                    "PARQUEADERO RikiRiki \n " +
                    "Valor hora o fraccion \n " +
                    "Carro: 2000 ---- Moto: 1000 \n" +
                    "El nombre del cliente es : \n" + nombre +
                    "La placa es : " + placa + "\n" +
                    "Hora de entrada : " + hora + "\n" +
                    "Hora salida : " + horasalida + "\n" +
                    "Valor a pagar :" + multi + "\n" +
                    "===========================================\n");
        }
        else {

                 multi = Math.ceil(resta) * 1000;
                 JOptionPane.showMessageDialog(null, "===========================================\n"+
                         "PARQUEADERO RikiRiki \n " +
                         "Valor hora o fraccion \n " +
                         "Carro: 2000 ---- Moto: 1000 \n" +
                         "La placa es : " + placa + "\n" +
                         "Hora de entrada : " + hora + "\n" +
                         "Hora salida : " + horasalida + "\n" +
                         "Valor a pagar :" + multi + "\n" +
                         "===========================================\n");
    }*/

        switch (tipo) {
            case 1:
                String [] IVehiculos = new String[10];
                for (int i=0;i<10;i++);{
                JOptionPane.showInputDialog("Digite su placa");
            }
            Array [] IhoraEntrada = new Double[10];
            for (int i=0;i>10;i++){
                JOptionPane.showInputDialog("Digite su hora de entrada");
            }
            Double [] IhoraSalida = new Double[10];
            for (int i=0;i>10;i++){
                JOptionPane.showInputDialog("Digite la hora de la salida");
            }


                JOptionPane.showMessageDialog(null, "===========================================\n"+
                        "PARQUEADERO RikiRiki \n " +
                        "Valor hora o fraccion \n " +
                        "Carro: 2000 ---- Moto: 1000 \n ");
                JOptionPane.showMessageDialog(null,"\n La placa es:" );
            for (int i=0;i<10;i++);{
                JOptionPane.showMessageDialog(null,(IhoraEntrada[1]);
            }


                JOptionPane.showMessageDialog(null, "Hora de entrada: " );
            for (int i=0;i>10;i++);{
                JOptionPane.showMessageDialog(null,(IhoraEntrada[i]));
            }


                JOptionPane.showMessageDialog(null, "Hora de salida: ");
            for (int i=0;i>10;);{
                JOptionPane.showMessageDialog(null,(IhoraSalida));
            }
                JOptionPane.showMessageDialog(null,"Valor a pagar :" + multi + "\n"+
                        "===========================================\n");
                        break;
            case 2:multi = Math.ceil(resta) * 1000;
                JOptionPane.showMessageDialog(null, "===========================================\n"+
                        "PARQUEADERO RikiRiki \n " +
                        "Valor hora o fraccion \n " +
                        "Carro: 2000 ---- Moto: 1000 \n" +

                        "La placa es : " + placa + "\n" +
                        "Hora de entrada : " + hora + "\n" +
                        "Hora salida : " + horasalida + "\n" +
                        "Valor a pagar :" + multi + "\n" +
                        "===========================================\n");
                        break;
            default:JOptionPane.showMessageDialog(null,"La opcion de digito no esta en el rango");
        }
    JOptionPane.showMessageDialog(null,"Gracias por utilizar nuestro parqueadero");
    }
}
import javax.swing.JOptionPane;

public class rikir {

    public static void main(String[] args) {

        String placa ;
        double hora, resta, multi, horasalida;
        int tipo;
        int moto = 2;
        int carro = 1;
        int nplacas;


        JOptionPane.showMessageDialog(null, "===========================================\n"+
                "Parqueadero RikiRiki \n" +
                "Valor hora o fraccion\n" +
                "Carro : 2000$ ---- Moto: 1000$ \n"+
                "===========================================\n");

        String [] ICarros = new String[10];
        placa = (JOptionPane.showInputDialog("Digite su placa"));
        for (int i=0;i<10;i++);
        Double [] IhoraEntrada = new Double[10];
        hora = Double.parseDouble(JOptionPane.showInputDialog("Digite su hora de entrada"));
        for (int i=0;i>10;i++);
        JOptionPane.showMessageDialog(null, "===========================================\n"+
                "PARQUEADERO RikiRiki\n " +
                "Valor hora o fraccion\n " +
                "Carro: 2000 ---- Moto: 1000 \n" +
                "La placa es : " + placa + "\n" +
                "Hora entrada : " + hora + "\n"+
                "===========================================\n");
        Double [] IhoraSalida = new Double[10];
        horasalida = Double.parseDouble(JOptionPane.showInputDialog("Digite la hora de la salida"));
        for (int i=0;i>10;i++);

        resta = horasalida - hora;

        tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si es Carrro y 2 si es Moto"));
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
            case 1:multi = Math.ceil(resta) * 2000;

                JOptionPane.showMessageDialog(null, "===========================================\n"+
                        "PARQUEADERO RikiRiki \n " +
                        "Valor hora o fraccion \n " +
                        "Carro: 2000 ---- Moto: 1000 \n" +
                        "La placa es : " + placa + "\n")
                        ;for (int i=0;i<10);

                JOptionPane.showMessageDialog(null,"Hora de entrada: "+hora)
                        for (int i=0;i>10);
                JOptionPane.showMessageDialog(null,"Hora salida : " + horasalida + "\n");
                         for (int i=0;i>10);
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
    }
}
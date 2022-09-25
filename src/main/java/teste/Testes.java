package teste;

import java.io.*;

public final class Testes {

    String Altura, Peso;

    public Testes(String peso, String altura) {
        this.Altura = altura;
        this.Peso = peso;
    }

    public String calculo() {

        String text = "\nVocê se encontra em estado de: ";

        Double peso = Double.parseDouble(Peso);
        Double altura = Double.parseDouble(Altura);

        //-------------------------testes-------------------------
        System.out.println("Teste - Is Number: " + isNum());
        System.out.println("Teste - Not Negative: " + notNegg());
        System.out.println("Teste - Not High: " + notHigh());
        System.out.println("Test - Not Void: " + notVoid());
        System.out.println("\n\n");
        if (!notNegg() || !isNum() || !notHigh() || !notVoid()) {
            return "ERRO";
        }
        //--------------------------------------------------------
        Long Resultado = Math.round(peso / (altura * altura));
        
        
        if (Resultado < 18.5) {
            return "IMC = " + Resultado + text + "Magreza!";
        }

        if (Resultado >= 18.5 && Resultado <= 24.9) {
            return "IMC = " + Resultado + text + "Saudável!";
        }

        if (Resultado >= 25 && Resultado <= 29.9) {
            return "IMC = " + Resultado + text + "Sobrepeso!";
        }

        if (Resultado >= 30 && Resultado <= 34.9) {
            return "IMC = " + Resultado + text + "Obesidade 1!";
        }

        if (Resultado >= 35 && Resultado <= 39.9) {
            return "IMC = " + Resultado + text + "Obesidade 2!";
        }

        if (Resultado >= 40 && Resultado <= 100) {
            return "IMC = " + Resultado + text + "Obesidade Grave!";
        }

        return "ERRO";
    }

    public boolean isNum() {
        try {
            String alt, pes;

            //Conjunto de IF´s para transformar valores em positivos!
            if (Arredondar(Altura) < 0) {
                alt = "" + (Arredondar(Altura) * -1);
            } else {
                alt = "" + (Arredondar(Altura));
            }
            if (Arredondar(Peso) < 0) {
                pes = "" + (Arredondar(Peso) * -1);
            } else {
                pes = "" + Arredondar(Peso);
            }
            //compara se os valores de peso e altura possuem algarismos
            if (alt.matches("[0-9]*") && pes.matches("[0-9]*")) {
                return true;
            }
        } catch (Exception ex) {
            return false;
        }
        return false;
    }

    public boolean notNegg() {
        return Arredondar(Altura) > 0 && Arredondar(Peso) > 0;
    }

    public boolean notHigh() {
        Long peso = Arredondar(Peso);
        Long altura = Arredondar(Altura);
        if(peso<0){
            peso*=-1;
        }
        if(altura<0){
            altura*=-1;
        }
        return !(altura>4 || peso>250);
    }

    public boolean notVoid() {
        return !("".equals(Altura) || "".equals(Peso));
    }

    public long Arredondar(String item) {
        //transforma String em Double
        Double a = Double.parseDouble(item);
        //Arredonda valor para Long para que round seja possivel
        long A = Math.round(a);
        return A;
    }
    
    public double Resultado(double peso, double altura){
        return Math.round(peso / (altura * altura));
    }
}

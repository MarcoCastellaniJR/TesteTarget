public class Teste04 {
    public static void main(String[] args) {
        double distancia = 100;
        double posicaoCarro = 0;

        double velocidadeCarroMin = 1.8;
        double velocidadeCaminhaoMin = 1.3;
        double variavelDePedadigio = (velocidadeCaminhaoMin * 5)*2 ;
        double posicaoCaminhao = 100 + variavelDePedadigio;
        System.out.println(velocidadeCarroMin);
        System.out.println(velocidadeCaminhaoMin);
        int contador=0;
        while(posicaoCaminhao > 0 ){
            contador++;
            if(posicaoCarro > 100){
                break;
            }
            posicaoCaminhao -= velocidadeCaminhaoMin;
            posicaoCarro += velocidadeCarroMin;
            System.out.println("Posição Caminhão: "+ posicaoCaminhao);
            System.out.println("Posição Carro: "+ posicaoCarro);
            System.out.println("Minuto" + contador);
            double carro = Math.round(posicaoCarro);
            double caminhao = Math.round(posicaoCaminhao);

            if(caminhao < carro ) {
                System.out.println("-------------------AQUIII---------------------");
                System.out.println("Posição Caminhão: "+ posicaoCaminhao);
                System.out.println("Posição Carro: "+ posicaoCarro);
                System.out.println("Minuto : " + contador);
                System.out.println("-------------------AQUIII---------------------");
                break;

            }

        }
        System.out.println(contador);
    }
}


/*
Primeiro eu defini a distancia que ele percorre por minuto,
criei uma variavel para saber a posição de cada veiculo
quando uma passa da outra significa que eles se cruzaram, e então eu pausei o programa,
o caminha eu adicionei o tempo do pedagio na variável
 */
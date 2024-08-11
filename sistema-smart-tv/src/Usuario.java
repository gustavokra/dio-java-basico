public class Usuario {
    public static void main(String[] args) {
         SmartTv smartTv = new SmartTv();

         smartTv.mudarCanal(23);
         System.out.println("Canal Atual: " + smartTv.canal);

         smartTv.diminuirVolume();
         smartTv.diminuirVolume();
         smartTv.diminuirVolume();
         smartTv.aumentarVolume();
         System.out.println("Volume atual : " + smartTv.volume);

         System.out.println("TV Ligada ? " + smartTv.ligada);
         System.out.println("Canal Atual? :" + smartTv.canal);
         System.out.println("Volume Atual? :" + smartTv.canal);

         smartTv.ligar();
         System.out.println("Novo Status -> TV Ligada :" + smartTv.ligada);

         smartTv.desligar();
         System.out.println("Novo Status -> TV Ligada :" + smartTv.ligada);

    }
}

public class Iphone  implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        System.out.println("Exibindo pagina do navegador");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
       System.out.println("Adicionando nov aba do navegador");
    }

    @Override
    public void atalizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atualizar pagina do navegador");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Iniciar ligação");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atender ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("deixar mensagem no correio de voz");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Iniciar reprodução de musica");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausar reprodução da musica");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("Escolher musicae executar");
    }
   
}

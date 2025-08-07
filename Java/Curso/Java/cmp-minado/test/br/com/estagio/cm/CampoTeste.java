package br.com.estagio.cm;

import br.com.estagio.cm.exception.ExplosaoException;
import br.com.estagio.cm.model.Campo;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CampoTeste {

    private Campo campo = new Campo(3,3);

    // Padrao teste
    //@Test
    //public void testIfEqualsTwo() {
    //    int a = 1 + 1;
    //    assertEquals(2, a);
    //}

    @Test
    public void testeVizinhoDist1Esquerda() {
        Campo vizinho = new Campo(3,2);
        boolean res = campo.addVizinho(vizinho);

        assertTrue(res);
    }

    @Test
    public void testeVizinhoDist1Direita() {
        Campo vizinho = new Campo(3,4);
        boolean res = campo.addVizinho(vizinho);

        assertTrue(res);
    }

    @Test
    public void testeVizinhoDist1Cima() {
        Campo vizinho = new Campo(2,3);
        boolean res = campo.addVizinho(vizinho);

        assertTrue(res);
    }

    @Test
    public void testeVizinhoDist1Baixo() {
        Campo vizinho = new Campo(4,3);
        boolean res = campo.addVizinho(vizinho);

        assertTrue(res);
    }

    @Test
    public void testeVizinhoDist2() {
        Campo vizinho = new Campo(2,2);
        boolean res = campo.addVizinho(vizinho);

        assertTrue(res);
    }

    @Test
    public void testeNaoVizinho() {
        Campo vizinho = new Campo(0,0);
        boolean res = campo.addVizinho(vizinho);

        assertFalse(res);
    }

    @Test
    public void testeValorMarcado(){
        assertFalse(campo.isMarcado());
    }

    @Test
    public void testeAlterarMark(){
        campo.alternarMark();
        assertTrue(campo.isMarcado());
    }

    @Test
    public void testeAlterarMarkDuasVezes() {
        campo.alternarMark();
        campo.alternarMark();
        assertFalse(campo.isMarcado());
    }

    @Test
    public void testeAbrirNaoMinadoNaoMarcado(){
        assertTrue(campo.abrirCampo());
    }

    @Test
    public void testeAbrirNaoMinadoMarcado(){
        campo.alternarMark();
        assertFalse(campo.abrirCampo());
    }

    @Test
    public void testeAbrirMinadoMarcado(){
        campo.minarCampo();
        campo.alternarMark();
        assertFalse(campo.abrirCampo());
    }

    @Test
    public void testeAbrirMinadoNaoMarcado(){
        campo.minarCampo();

        assertThrows(ExplosaoException.class, () -> {
           campo.abrirCampo();
        });
    }

    @Test
    public void testeAbrirComVizinho(){

        Campo campo11 = new Campo(1,1);
        Campo campo22 = new Campo(2,2);
        campo22.addVizinho(campo11);

        campo.addVizinho(campo22);
        campo.abrirCampo();

        assertTrue(campo22.isAberto() && campo11.isAberto());
    }

    @Test
    public void testeAbrirComVizinho2(){

        Campo campo11 = new Campo(1,1);

        Campo campo12 = new Campo(1,2);
        campo12.minarCampo();

        Campo campo22 = new Campo(2,2);
        campo22.addVizinho(campo11);
        campo22.addVizinho(campo12);

        campo.addVizinho(campo22);
        campo.abrirCampo();

        assertTrue(campo22.isAberto() && campo11.isFechado());
    }

    @Test
    public void testeObjetivoAlcadoDesvendado() {

        Campo campo11 = new Campo(1,1);
        Campo campo22 = new Campo(2,2);
        campo22.addVizinho(campo11);

        campo.addVizinho(campo22);
        campo.abrirCampo();

        assertTrue(campo11.objetivoAlcancado() && campo22.objetivoAlcancado());
    }

    @Test
    public void testeObjetivoAlcadoProtegido() {

        Campo campo11 = new Campo(1,1);
        Campo campo22 = new Campo(2,2);
        campo22.addVizinho(campo11);
        campo22.minarCampo();
        campo22.alternarMark();

        campo.addVizinho(campo22);
        campo.abrirCampo();

        assertTrue(campo22.objetivoAlcancado());
    }

    @Test
    public void testeReset() {
        Campo campo11 = new Campo(1,1);
        Campo campo22 = new Campo(2,2);
        campo22.addVizinho(campo11);
        campo.addVizinho(campo22);

        campo22.resetar();

        assertFalse(campo22.isMinado());
        assertFalse(campo22.isAberto());
        assertFalse(campo22.isMarcado());
    }
}

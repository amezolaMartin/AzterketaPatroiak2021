/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bi_ariketa;

/**
 *
 * @author martin
 */
public class TarrinaAdapter implements Izozkia{
    private TarrinaIzozkia nTar;

    public TarrinaAdapter()
    {
        this.nTar = new TarrinaIzozkia();
        this.edukiaIzoztu();
        this.izozkiaPrestatu();
        this.edukiaSartu();
    }
    
    @Override
    public void edukiaIzoztu() {
        this.nTar.contentFreeze();
    }

    @Override
    public void izozkiaPrestatu() {
        this.nTar.contentPrepare();
    }

    @Override
    public void edukiaSartu() {
        this.nTar.tarrinaPrepare();
        this.nTar.content2Tarrina();
    }
}

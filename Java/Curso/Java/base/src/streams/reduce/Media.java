package streams.reduce;

public class Media {

    private double tot;
    private int qnt;

    public Media add(double valor) {
        tot += valor;
        qnt++;
        return this;
    }

    public  double getMedia() {
        return tot/qnt;
    }

    public static Media combinar(Media m1, Media m2) {
        Media res = new Media();
        res.tot = m1.tot + m2.tot;
        res.qnt = m1.qnt + m2.qnt;
        return res;
    }
}

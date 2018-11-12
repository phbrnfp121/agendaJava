abstract class EssaiDuree {
    static void essayer() {
        Duree d;
        d = new Duree(1, 30);
        System.out.println(d);
        try {
            d.moins1heure();
            System.out.println(d);
            d.moins1heure();
            System.out.println(d);
        } catch(ExceptionOperationImpossible e) {
            System.out.println(e);
        }
    }
}

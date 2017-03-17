public class GroupData {
    private final String par1;
    private final String par2;
    private final String par3;
    private final String par4;
    private final String par5;
    private final String par6;
    private final String par7;
    private final String captcha;

    public GroupData(String par1, String par2, String par3, String par4, String par5, String par6, String par7, String captcha) {
        this.par1 = par1;
        this.par2 = par2;
        this.par3 = par3;
        this.par4 = par4;
        this.par5 = par5;
        this.par6 = par6;
        this.par7 = par7;
        this.captcha = captcha;
    }

    public String getPar1() {
        return par1;
    }

    public String getPar2() {
        return par2;
    }

    public String getPar3() {
        return par3;
    }

    public String getPar4() {
        return par4;
    }

    public String getPar5() {
        return par5;
    }

    public String getPar6() {
        return par6;
    }

    public String getPar7() {
        return par7;
    }

    public String getCaptcha() {
        return captcha;
    }
}

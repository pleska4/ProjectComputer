package computer.enums;

public enum BrandOfComputer {
    SAMSUNG(NameOfBrand.BRAND,ProduceOfComputer.SAMSUNG),
    XIAOMI(NameOfBrand.BRAND,ProduceOfComputer.XIAOMI),
    HUAWEI(NameOfBrand.BRAND,ProduceOfComputer.HUAWEI),
    LG(NameOfBrand.BRAND, ProduceOfComputer.LG);

    private NameOfBrand nameOfBrand;
    private ProduceOfComputer produceOfComputer;

    BrandOfComputer(NameOfBrand nameOfBrand, ProduceOfComputer produceOfComputer) {
        this.nameOfBrand = nameOfBrand;
        this.produceOfComputer = produceOfComputer;
    }

    public ProduceOfComputer getpPoduceOfComputer() {
        return produceOfComputer;
    }

    public NameOfBrand getNameOfBrand() {
        return nameOfBrand;
    }

}
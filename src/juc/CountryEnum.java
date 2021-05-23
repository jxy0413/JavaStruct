package juc;


/**
 * @Author jiaxiangyu
 * @Date 2021/3/18 19:03
 */
public enum CountryEnum {
    ONE(1,"齐"),TWO(2,"楚"),THREE(3,"燕");
    private Integer retCode;
    private String retMessage;
    CountryEnum(Integer retCode,String retMessage){
        this.retCode = retCode;
        this.retMessage = retMessage;
    }
    
    public Integer getRetCode() {
        return retCode;
    }
    
    public String getRetMessage() {
        return retMessage;
    }
    
    public static CountryEnum forEach_CountryEnum(int index){
        CountryEnum[] values = CountryEnum.values();
        for(CountryEnum countryEnum:values){
            if(index==countryEnum.getRetCode()){
                return countryEnum;
            }
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119078.adamfirdausdarmawan;

/**
 *
 * @author ryzen
 */
public class ServicePrice implements ServiceItem{
    private float priceService;
    private float discount;
    
    public float getPriceService(){
        return priceService;
    }
    
    public void setPriceService(float priceService){
        this.priceService=priceService;
    }
    @Override
    public void displayService(){
        System.out.println("#***************#");
        System.out.println("#***Rock n Roll Haircut#***");
        System.out.println("#******Service List******#");
        System.out.println("1.Haircut : IDR 45K");
        System.out.println("2.Haircut + Hair : IDR 55K");
        System.out.println("3.Hairwash Only : IDR 15K");
        System.out.println("#***************#");

    }
    
    @Override
    public float getPrice(int serviceItem){
        if (serviceItem == 1){
            priceService = 45000;
        } else if (serviceItem == 2){
            priceService = 55000;
        } else if (serviceItem == 3){
            priceService = 15000;
        } else
            System.out.println("Tidak ada");
        return priceService;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        System.out.println("Are you a member(yes/no)");
        return statusMember.equals(statusMember);
    }
    

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        return discount;
    }
    
   
}

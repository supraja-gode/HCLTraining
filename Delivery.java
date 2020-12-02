package deliverydetails;
class Delivery
{
	Long over;
	Long ball;
	Long runs;
	String batsman;
	String bowler;
  	String nonstriker;
void displayDeliveryDetails(Long ov,Long ba,Long ru,String bats,String bow,String ns)
{
	over=ov;
        ball=ba;
	runs=ru;
	batsman=bats;
	bowler=bow;
	nonstriker=ns;
}
}
class CellPhone
{
  void switchOff()
  {
    System.out.println("Switch Off Phone");
  }
  void switchOn()
  {
    System.out.println("Switch On Phone");
  }
  void callConnect(int number1, int number2)
  {
    System.out.println(number1 + " " + number2);
    System.out.println("Calling...");
  }
  void callDisconnect()
  {
    System.out.println("Disconnect Phone... ");
  }
}

interface Camera
{
  void clickPhoto();
  void deletPhoto();
  private void selectPhoto()
  {
    System.out.println("Photo Selected...");
  }
  default void showPhoto()
  {
    selectPhoto();
    System.out.println("Show Photo..");
  }
}

interface Wifi 
{
  void connectWifi(String name);
  void disconnectWifi();
}

interface VideoPlayer
{
  void playVideo();
  void pauseVideo();
}

class SmartPhone extends CellPhone implements Camera, Wifi,VideoPlayer
{
  public void clickPhoto()
  {
    System.out.println("Photo Clicked");
  }
  public void deletPhoto()
  {
    System.out.println("Photo Deleted");
  }
  public void connectWifi(String name)
  {
    System.out.println("Wifi connected...");
  }
  public void disconnectWifi()
  {
    System.out.println("Wifi Disconnected...");
  }
  public void playVideo()
  {
    System.out.println("Video play...");
  }
  public void pauseVideo()
  {
    System.out.println("Video paused...");
  }
  // public void showPhoto()
  // {
  //   System.out.println("See Image..."); --> This will be printed
  // }
}

public class PhoneInterface 
{
  public static void main (String [] args)
  {
    SmartPhone s = new SmartPhone();
    s.switchOn();
    s.callConnect(86009 ,21454);
    s.callDisconnect();
    s.clickPhoto();
    s.deletPhoto();
    s.connectWifi("Harshal");
    s.playVideo();
    s.pauseVideo();
    s.disconnectWifi();
    s.switchOff();
    // s.selectPhoto(); --> Give error
    s.showPhoto();
  }
}

package nested_classes;

public class Button {

    private OnClickEvent clickEvent = new OnClickEvent() {
        @Override
        void click() {
            if(isOn) {
                System.out.println("Button is OFF");
                isOn = false;
            } else {
                System.out.println("Button is ON");
                isOn = true;
            }
        }
    };
    private OnClickEvent clickEvent2 = new OnClickEvent() {
        @Override
        void click() {
            color = !isOn ? "GREEN" : "RED";
            if(isOn) {
                System.out.format("Button is OFF (%s)%n", color);
                isOn = false;
            } else {
                System.out.format("Button is ON (%s)%n", color);
                isOn = true;
            }
        }
    };

    private OnPressEvent onPressEvent = new OnPressEvent() {

        boolean isOn;
        String color;

        @Override
        public void press() {
            color = !isOn ? "GREEN" : "RED";
            if(isOn) {
                System.out.format("Button is OFF (%s)%n", color);
                isOn = false;
            } else {
                System.out.format("Button is ON (%s)%n", color);
                isOn = true;
            }
        }
    };

    private abstract class OnClickEvent {
        boolean isOn;
        String color;
        abstract void click();
    }

    private interface OnPressEvent {
        void press();
    }

    public void click() {
        clickEvent2.click();
        //onPressEvent.press();
    }
}

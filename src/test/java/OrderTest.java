import static org.fest.assertions.api.Assertions.assertThat;
import order.Item;
import order.Order;

import org.junit.Test;


public class OrderTest {
    @Test
    public void order_updateStatus_test() {
        //given
        Item item1= new Item();
        Item item2= new Item();

        Order order1 = new Order("test1");
        order1.addItem(item1,1);
        order1.addItem(item2,2);

        order1.updateStatus("payed");

        //then
        assertThat(order1.getStatus()).isEqualTo("payed");
    }

    @Test
    public void order_updateAddr_test() {
        //given
        Item item1= new Item();
        Item item2= new Item();

        Order order1 = new Order("test2");
        order1.addItem(item1,1);
        order1.addItem(item2,2);

        order1.updateSendAddr("Shanghai");

        //then
        assertThat(order1.getSendAddr()).isEqualTo("Shanghai");
    }

    @Test
    public void order_save_test() {
        //given
        Item item1= new Item();
        Item item2= new Item();

        Order order1 = new Order("1");
        order1.addItem(item1,1);
        order1.addItem(item2,2);

        order1.saveOrder();

        Order findOrder = order1.findOrder("1");

        //then
        assertThat(findOrder).isEqualTo(order1);
    }

    @Test
    public void order_addItem_test() {
        //given
        Item item1= new Item();
        Item item2= new Item();

        Order order1 = new Order("1");
        boolean isAdd = order1.addItem(item1,1);

        //then
        assertThat(isAdd).isEqualTo(true);
    }

    @Test
    public void order_deleteItem_test() {
        //given
        Item item1= new Item();
        Item item2= new Item();

        Order order1 = new Order("1");
        order1.addItem(item1,1);
        boolean isMinor = order1.minItem(item1);

        //then
        assertThat(isMinor).isEqualTo(true);
    }

//    @Test
//    public void order_delete_test() {
//        //given
//        Item item1= new Item();
//        Item item2= new Item();
//
//        Order order1 = new Order("1");
//        order1.addItem(item1,1);
//        order1.addItem(item2,2);
//
//        order1.deleteOrder();
//
//        Order findOrder = order1.findOrder("1");
//        //then
//        assertThat(findOrder).isEqualTo(false);
//
//    }


}

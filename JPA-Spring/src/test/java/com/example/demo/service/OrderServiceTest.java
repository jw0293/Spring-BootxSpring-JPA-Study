package com.example.demo.service;

import com.example.demo.domain.Address;
import com.example.demo.domain.Member;
import com.example.demo.domain.Order;
import com.example.demo.domain.OrderStatus;
import com.example.demo.domain.item.Book;
import com.example.demo.exception.NotEnoughStockException;
import com.example.demo.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
class OrderServiceTest {

    @Autowired EntityManager em;
    @Autowired OrderService orderService;
    @Autowired OrderRepository orderRepository;

    @Test
    public void 상품주문() throws Exception{
        // given
        Member member = createMember();

        Book book = createBook("노인과바다", 10000, 10);

        // when
        int orderCount = 2;
        Long order = orderService.order(member.getId(), book.getId(), orderCount);

        // then
        Order findOne = orderRepository.findOne(order);

        assertThat(OrderStatus.ORDER).isEqualTo(findOne.getOrderStatus());
    }

    private Book createBook(String name, int price, int stockQuantity) {
        Book book = new Book();
        book.setName(name);
        book.setPrice(price);
        book.setStockQuantity(stockQuantity);
        em.persist(book);
        return book;
    }

    private Member createMember() {
        Member member = new Member();
        member.setName("김중원");
        member.setAddress(new Address("서울", "한천로", "2306"));
        em.persist(member);
        return member;
    }

      @Test
      public void 주문취소() throws Exception{
          // given
          Member member = createMember();
          Book book = createBook("시골JPA", 10000, 10);

          int orderCount = 5;
          Long order = orderService.order(member.getId(), book.getId(), orderCount);
          // when
          orderService.cancelOrder(order);

          // then
          Order cancelOrder = orderRepository.findOne(order);

          assertThat(cancelOrder.getOrderStatus()).isEqualTo(OrderStatus.CANCEL);
      }
}
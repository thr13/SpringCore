package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /**
     * @param member
     * @param price
     * @return 할인대상금액
     */
    int discount(Member member, int price);

}

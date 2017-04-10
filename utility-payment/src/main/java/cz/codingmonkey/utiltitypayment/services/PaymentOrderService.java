package cz.codingmonkey.utiltitypayment.services;

import com.google.common.collect.ImmutableList;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Richard Stefanca
 */
@Slf4j
@Service
public class PaymentOrderService {

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	public void savePaymentOrder(int paymentListId, List<Integer> ids) {
		log.info("Saving order for payment list: {}", paymentListId);
		List<String> collect = ids.stream()
				.map(Object::toString)
				.collect(Collectors.toList());
		String val = StringUtils.join(collect, ",");
		String key = String.valueOf(paymentListId);
		redisTemplate.opsForHash().put(key, key, val);
	}

	public List<Integer> getPaymentListOrder(int paymentListId) {
		String key = String.valueOf(paymentListId);
		String idsString = (String)redisTemplate.opsForHash().get(key, key);
		if (idsString != null) {
			String[] split = idsString.split(",");
			List<Integer> idsList = Arrays.stream(split)
					.map(Integer::parseInt)
					.collect(Collectors.toList());

			return ImmutableList.copyOf(idsList);
		}

		return Collections.emptyList();
	}
}

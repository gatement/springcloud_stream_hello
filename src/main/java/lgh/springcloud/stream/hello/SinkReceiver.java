package lgh.springcloud.stream.hello;

import java.io.UnsupportedEncodingException;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import lombok.extern.slf4j.Slf4j;

@EnableBinding(Sink.class)
@Slf4j
public class SinkReceiver {

	@StreamListener(Sink.INPUT)
	public void receive(byte[] payload) throws UnsupportedEncodingException {
		log.info("Received: {}", new String(payload, "UTF-8"));
	}

}

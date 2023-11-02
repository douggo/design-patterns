package br.com.douggo.iterator.tvChannel;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IteratorChannel implements Iterator<Integer> {

    private final Integer[] channels;

    private int index;

    public IteratorChannel(Integer[] channels) {
        this.channels = channels;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (Objects.isNull(this.channels)) {
            return false;
        }
        return Objects.nonNull(this.channels[this.index]);
    }

    @Override
    public Integer next() {
        return this.channels[this.index++];
    }
}

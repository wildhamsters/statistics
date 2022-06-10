package org.wildhamsters.statistics;

/**
 * @author Piotr Chowaniec
 */
interface Mapper<K, V> {

    V map(K key);
}

package com.javatunes.catalog;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {
    private InMemoryCatalog catalog;

    @Before
    public void setUp() {
        catalog = new InMemoryCatalog();
    }

    @Test
    public void getRockItemsAtSpecifiedPrice_shouldReturnCollection_whenMaxPriceInBounds() {
        Collection<MusicItem> rockCollection = catalog.getRockItemsAtSpecifiedPrice(15.0);
        assertEquals(4, rockCollection.size());
    }

    @Test
    public void getRockItemsAtSpecifiedPrice_shouldReturnEmptyCollection_whenMaxPriceOutOfBounds() {
        Collection<MusicItem> needMoreMoney = catalog.getRockItemsAtSpecifiedPrice(10.0);
        assertEquals(0, needMoreMoney.size());
    }

    @Test
    public void selfTitledAlbums_shouldReturnCollection_whenTitleAndArtistMatch() {
        Collection<MusicItem> populatedCollection = catalog.getSelfTitledAlbums();
        assertEquals(2, populatedCollection.size());
    }

    @Test
    public void findByCategory_shouldReturnPopulatedCollection_categoryFound() {
        Collection<MusicItem> popItems = catalog.findByCategory(MusicCategory.POP);
        assertEquals(4, popItems.size());
        //all MusicItems in this collection should be pop
    }

    @Test
    public void findById_shouldReturnNull_idNotFound() {
        MusicItem item = catalog.findById(19L);
        assertNull(item);
    }

    @Test
    public void findById_shouldReturnMusicItemWithThatID_idFound() {
        MusicItem item = catalog.findById(6L);
        assertEquals(6L, item.getId().longValue());
    }
}
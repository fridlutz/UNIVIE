package at.ac.univie.swa.ase.example;

import at.ac.univie.swa.ase.example.playlistDsl.Item;
import at.ac.univie.swa.ase.example.playlistDsl.Playlist;
import at.ac.univie.swa.ase.example.playlistDsl.PlaylistItem;
import at.ac.univie.swa.ase.example.playlistDsl.Song;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class PlayListUtils {
  protected Set<Song> _getSongs(final PlaylistItem playListItem) {
    return CollectionLiterals.<Song>emptySet();
  }
  
  protected Set<Song> _getSongs(final Song song) {
    return CollectionLiterals.<Song>newHashSet(song);
  }
  
  protected Collection<Song> _getSongs(final Playlist list) {
    EList<Item> _items = list.getItems();
    final Function1<Item, Collection<Song>> _function = new Function1<Item, Collection<Song>>() {
      public Collection<Song> apply(final Item it) {
        return PlayListUtils.this.getSongs(it);
      }
    };
    List<Collection<Song>> _map = ListExtensions.<Item, Collection<Song>>map(_items, _function);
    Iterable<Song> _flatten = Iterables.<Song>concat(_map);
    return IterableExtensions.<Song>toList(_flatten);
  }
  
  protected Collection<Song> _getSongs(final Item item) {
    PlaylistItem _item = item.getItem();
    Collection<Song> songs = this.getSongs(_item);
    boolean _and = false;
    PlaylistItem _item_1 = item.getItem();
    if (!(_item_1 instanceof Playlist)) {
      _and = false;
    } else {
      EList<Song> _excluded = item.getExcluded();
      boolean _isEmpty = _excluded.isEmpty();
      boolean _not = (!_isEmpty);
      _and = _not;
    }
    if (_and) {
      EList<Song> _excluded_1 = item.getExcluded();
      songs.removeAll(_excluded_1);
    }
    return IterableExtensions.<Song>toList(songs);
  }
  
  public Collection<Song> getSongs(final EObject list) {
    if (list instanceof Playlist) {
      return _getSongs((Playlist)list);
    } else if (list instanceof Song) {
      return _getSongs((Song)list);
    } else if (list instanceof Item) {
      return _getSongs((Item)list);
    } else if (list instanceof PlaylistItem) {
      return _getSongs((PlaylistItem)list);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(list).toString());
    }
  }
}

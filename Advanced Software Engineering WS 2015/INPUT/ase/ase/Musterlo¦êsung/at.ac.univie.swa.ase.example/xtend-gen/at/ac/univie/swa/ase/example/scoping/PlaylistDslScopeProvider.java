/**
 * generated by Xtext
 */
package at.ac.univie.swa.ase.example.scoping;

import at.ac.univie.swa.ase.example.PlayListUtils;
import at.ac.univie.swa.ase.example.playlistDsl.Item;
import at.ac.univie.swa.ase.example.playlistDsl.Playlist;
import at.ac.univie.swa.ase.example.playlistDsl.PlaylistItem;
import at.ac.univie.swa.ase.example.playlistDsl.Song;
import java.util.Collection;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it
 */
@SuppressWarnings("all")
public class PlaylistDslScopeProvider extends AbstractDeclarativeScopeProvider {
  @Extension
  private PlayListUtils utils = new PlayListUtils();
  
  /**
   * This scope is actually wrong - it does not resolve child lists
   */
  public IScope scope_Item_excluded(final Item context, final EReference reference) {
    PlaylistItem _item = context.getItem();
    if ((_item instanceof Playlist)) {
      PlaylistItem _item_1 = context.getItem();
      final Collection<Song> songsInList = this.utils.getSongs(_item_1);
      return Scopes.scopeFor(songsInList);
    } else {
      IScopeProvider _delegate = this.getDelegate();
      return _delegate.getScope(context, reference);
    }
  }
}

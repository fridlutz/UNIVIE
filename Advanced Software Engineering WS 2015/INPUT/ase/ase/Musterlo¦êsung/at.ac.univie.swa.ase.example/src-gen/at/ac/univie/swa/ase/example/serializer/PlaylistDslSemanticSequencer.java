package at.ac.univie.swa.ase.example.serializer;

import at.ac.univie.swa.ase.example.playlistDsl.Distributor;
import at.ac.univie.swa.ase.example.playlistDsl.Item;
import at.ac.univie.swa.ase.example.playlistDsl.Length;
import at.ac.univie.swa.ase.example.playlistDsl.Library;
import at.ac.univie.swa.ase.example.playlistDsl.Model;
import at.ac.univie.swa.ase.example.playlistDsl.Playlist;
import at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage;
import at.ac.univie.swa.ase.example.playlistDsl.Song;
import at.ac.univie.swa.ase.example.services.PlaylistDslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PlaylistDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PlaylistDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PlaylistDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PlaylistDslPackage.DISTRIBUTOR:
				if(context == grammarAccess.getDistributorRule()) {
					sequence_Distributor(context, (Distributor) semanticObject); 
					return; 
				}
				else break;
			case PlaylistDslPackage.ITEM:
				if(context == grammarAccess.getItemRule()) {
					sequence_Item(context, (Item) semanticObject); 
					return; 
				}
				else break;
			case PlaylistDslPackage.LENGTH:
				if(context == grammarAccess.getLengthRule()) {
					sequence_Length(context, (Length) semanticObject); 
					return; 
				}
				else break;
			case PlaylistDslPackage.LIBRARY:
				if(context == grammarAccess.getLibraryRule()) {
					sequence_Library(context, (Library) semanticObject); 
					return; 
				}
				else break;
			case PlaylistDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case PlaylistDslPackage.PLAYLIST:
				if(context == grammarAccess.getPlaylistRule() ||
				   context == grammarAccess.getPlaylistItemRule()) {
					sequence_Playlist(context, (Playlist) semanticObject); 
					return; 
				}
				else break;
			case PlaylistDslPackage.SONG:
				if(context == grammarAccess.getPlaylistItemRule() ||
				   context == grammarAccess.getSongRule()) {
					sequence_Song(context, (Song) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID address=STRING iban=STRING bic=STRING)
	 */
	protected void sequence_Distributor(EObject context, Distributor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PlaylistDslPackage.Literals.DISTRIBUTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlaylistDslPackage.Literals.DISTRIBUTOR__NAME));
			if(transientValues.isValueTransient(semanticObject, PlaylistDslPackage.Literals.DISTRIBUTOR__ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlaylistDslPackage.Literals.DISTRIBUTOR__ADDRESS));
			if(transientValues.isValueTransient(semanticObject, PlaylistDslPackage.Literals.DISTRIBUTOR__IBAN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlaylistDslPackage.Literals.DISTRIBUTOR__IBAN));
			if(transientValues.isValueTransient(semanticObject, PlaylistDslPackage.Literals.DISTRIBUTOR__BIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlaylistDslPackage.Literals.DISTRIBUTOR__BIC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDistributorAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDistributorAccess().getAddressSTRINGTerminalRuleCall_3_0(), semanticObject.getAddress());
		feeder.accept(grammarAccess.getDistributorAccess().getIbanSTRINGTerminalRuleCall_6_0(), semanticObject.getIban());
		feeder.accept(grammarAccess.getDistributorAccess().getBicSTRINGTerminalRuleCall_8_0(), semanticObject.getBic());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (item=[Song|FQN] | (item=[Playlist|ID] (excluded+=[Song|FQN] excluded+=[Song|FQN]*)?))
	 */
	protected void sequence_Item(EObject context, Item semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (minutes=INT seconds=SECONDS)
	 */
	protected void sequence_Length(EObject context, Length semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PlaylistDslPackage.Literals.LENGTH__MINUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlaylistDslPackage.Literals.LENGTH__MINUTES));
			if(transientValues.isValueTransient(semanticObject, PlaylistDslPackage.Literals.LENGTH__SECONDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlaylistDslPackage.Literals.LENGTH__SECONDS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLengthAccess().getMinutesINTTerminalRuleCall_0_0(), semanticObject.getMinutes());
		feeder.accept(grammarAccess.getLengthAccess().getSecondsSECONDSTerminalRuleCall_2_0(), semanticObject.getSeconds());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID songs+=Song*)
	 */
	protected void sequence_Library(EObject context, Library semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (distributors+=Distributor+ songLibrary+=Library+ playlists+=Playlist*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID items+=Item items+=Item*)
	 */
	protected void sequence_Playlist(EObject context, Playlist semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         artist=STRING 
	 *         distributor=[Distributor|ID] 
	 *         length=Length 
	 *         genre=Genre 
	 *         price=DOUBLE
	 *     )
	 */
	protected void sequence_Song(EObject context, Song semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PlaylistDslPackage.Literals.PLAYLIST_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlaylistDslPackage.Literals.PLAYLIST_ITEM__NAME));
			if(transientValues.isValueTransient(semanticObject, PlaylistDslPackage.Literals.SONG__ARTIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlaylistDslPackage.Literals.SONG__ARTIST));
			if(transientValues.isValueTransient(semanticObject, PlaylistDslPackage.Literals.SONG__DISTRIBUTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlaylistDslPackage.Literals.SONG__DISTRIBUTOR));
			if(transientValues.isValueTransient(semanticObject, PlaylistDslPackage.Literals.SONG__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlaylistDslPackage.Literals.SONG__LENGTH));
			if(transientValues.isValueTransient(semanticObject, PlaylistDslPackage.Literals.SONG__GENRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlaylistDslPackage.Literals.SONG__GENRE));
			if(transientValues.isValueTransient(semanticObject, PlaylistDslPackage.Literals.SONG__PRICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlaylistDslPackage.Literals.SONG__PRICE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSongAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSongAccess().getArtistSTRINGTerminalRuleCall_3_0(), semanticObject.getArtist());
		feeder.accept(grammarAccess.getSongAccess().getDistributorDistributorIDTerminalRuleCall_5_0_1(), semanticObject.getDistributor());
		feeder.accept(grammarAccess.getSongAccess().getLengthLengthParserRuleCall_7_0(), semanticObject.getLength());
		feeder.accept(grammarAccess.getSongAccess().getGenreGenreEnumRuleCall_9_0(), semanticObject.getGenre());
		feeder.accept(grammarAccess.getSongAccess().getPriceDOUBLETerminalRuleCall_11_0(), semanticObject.getPrice());
		feeder.finish();
	}
}

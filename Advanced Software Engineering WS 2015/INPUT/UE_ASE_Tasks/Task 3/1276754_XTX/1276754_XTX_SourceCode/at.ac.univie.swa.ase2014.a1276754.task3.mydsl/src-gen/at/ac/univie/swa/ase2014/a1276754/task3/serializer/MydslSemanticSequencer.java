package at.ac.univie.swa.ase2014.a1276754.task3.serializer;

import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Time;
import at.ac.univie.swa.ase2014.a1276754.task3.services.MydslGrammarAccess;
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
public class MydslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MydslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MydslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MydslPackage.ACCOUNT_INFORMATION:
				if(context == grammarAccess.getAccount_InformationRule()) {
					sequence_Account_Information(context, (Account_Information) semanticObject); 
					return; 
				}
				else break;
			case MydslPackage.DISTRIBUTOR:
				if(context == grammarAccess.getDistributorRule()) {
					sequence_Distributor(context, (Distributor) semanticObject); 
					return; 
				}
				else break;
			case MydslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case MydslPackage.PLAYLIST:
				if(context == grammarAccess.getPlaylistRule()) {
					sequence_Playlist(context, (Playlist) semanticObject); 
					return; 
				}
				else break;
			case MydslPackage.SONG:
				if(context == grammarAccess.getSongRule()) {
					sequence_Song(context, (Song) semanticObject); 
					return; 
				}
				else break;
			case MydslPackage.TIME:
				if(context == grammarAccess.getTimeRule()) {
					sequence_Time(context, (Time) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (iban=STRING bic=STRING)
	 */
	protected void sequence_Account_Information(EObject context, Account_Information semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MydslPackage.Literals.ACCOUNT_INFORMATION__IBAN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MydslPackage.Literals.ACCOUNT_INFORMATION__IBAN));
			if(transientValues.isValueTransient(semanticObject, MydslPackage.Literals.ACCOUNT_INFORMATION__BIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MydslPackage.Literals.ACCOUNT_INFORMATION__BIC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccount_InformationAccess().getIbanSTRINGTerminalRuleCall_1_0(), semanticObject.getIban());
		feeder.accept(grammarAccess.getAccount_InformationAccess().getBicSTRINGTerminalRuleCall_3_0(), semanticObject.getBic());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID adresse=STRING acc_info=Account_Information)
	 */
	protected void sequence_Distributor(EObject context, Distributor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MydslPackage.Literals.DISTRIBUTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MydslPackage.Literals.DISTRIBUTOR__NAME));
			if(transientValues.isValueTransient(semanticObject, MydslPackage.Literals.DISTRIBUTOR__ADRESSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MydslPackage.Literals.DISTRIBUTOR__ADRESSE));
			if(transientValues.isValueTransient(semanticObject, MydslPackage.Literals.DISTRIBUTOR__ACC_INFO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MydslPackage.Literals.DISTRIBUTOR__ACC_INFO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDistributorAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDistributorAccess().getAdresseSTRINGTerminalRuleCall_2_0(), semanticObject.getAdresse());
		feeder.accept(grammarAccess.getDistributorAccess().getAcc_infoAccount_InformationParserRuleCall_4_0(), semanticObject.getAcc_info());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (distributors+=Distributor+ songs+=Song+ playlists+=Playlist*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID songs+=[Song|ID]* songs+=[Song|ID]? (incl+=[Playlist|ID] excl+=[Song|ID]?)*)
	 */
	protected void sequence_Playlist(EObject context, Playlist semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         artist=STRING 
	 *         dist=[Distributor|ID] 
	 *         length=Time 
	 *         genre=Genre 
	 *         price=Double
	 *     )
	 */
	protected void sequence_Song(EObject context, Song semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MydslPackage.Literals.SONG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MydslPackage.Literals.SONG__NAME));
			if(transientValues.isValueTransient(semanticObject, MydslPackage.Literals.SONG__ARTIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MydslPackage.Literals.SONG__ARTIST));
			if(transientValues.isValueTransient(semanticObject, MydslPackage.Literals.SONG__DIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MydslPackage.Literals.SONG__DIST));
			if(transientValues.isValueTransient(semanticObject, MydslPackage.Literals.SONG__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MydslPackage.Literals.SONG__LENGTH));
			if(transientValues.isValueTransient(semanticObject, MydslPackage.Literals.SONG__GENRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MydslPackage.Literals.SONG__GENRE));
			if(transientValues.isValueTransient(semanticObject, MydslPackage.Literals.SONG__PRICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MydslPackage.Literals.SONG__PRICE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSongAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSongAccess().getArtistSTRINGTerminalRuleCall_2_0(), semanticObject.getArtist());
		feeder.accept(grammarAccess.getSongAccess().getDistDistributorIDTerminalRuleCall_4_0_1(), semanticObject.getDist());
		feeder.accept(grammarAccess.getSongAccess().getLengthTimeParserRuleCall_6_0(), semanticObject.getLength());
		feeder.accept(grammarAccess.getSongAccess().getGenreGenreEnumRuleCall_8_0(), semanticObject.getGenre());
		feeder.accept(grammarAccess.getSongAccess().getPriceDoubleParserRuleCall_10_0(), semanticObject.getPrice());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (min=INT sec=INT)
	 */
	protected void sequence_Time(EObject context, Time semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MydslPackage.Literals.TIME__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MydslPackage.Literals.TIME__MIN));
			if(transientValues.isValueTransient(semanticObject, MydslPackage.Literals.TIME__SEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MydslPackage.Literals.TIME__SEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTimeAccess().getMinINTTerminalRuleCall_0_0(), semanticObject.getMin());
		feeder.accept(grammarAccess.getTimeAccess().getSecINTTerminalRuleCall_2_0(), semanticObject.getSec());
		feeder.finish();
	}
}

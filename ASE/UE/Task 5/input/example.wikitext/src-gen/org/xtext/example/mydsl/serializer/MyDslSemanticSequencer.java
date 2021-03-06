/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.serializer;

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
import org.xtext.example.mydsl.myDsl.About;
import org.xtext.example.mydsl.myDsl.AbstractElement;
import org.xtext.example.mydsl.myDsl.ActualInformation;
import org.xtext.example.mydsl.myDsl.BlockQuote;
import org.xtext.example.mydsl.myDsl.BoldText;
import org.xtext.example.mydsl.myDsl.Category;
import org.xtext.example.mydsl.myDsl.Comment;
import org.xtext.example.mydsl.myDsl.Document;
import org.xtext.example.mydsl.myDsl.ExternalLink;
import org.xtext.example.mydsl.myDsl.File;
import org.xtext.example.mydsl.myDsl.FormattedText;
import org.xtext.example.mydsl.myDsl.FormattedTextWithoutLinks;
import org.xtext.example.mydsl.myDsl.Heading;
import org.xtext.example.mydsl.myDsl.Heading1;
import org.xtext.example.mydsl.myDsl.Heading2;
import org.xtext.example.mydsl.myDsl.Heading3;
import org.xtext.example.mydsl.myDsl.Heading4;
import org.xtext.example.mydsl.myDsl.InternalLink;
import org.xtext.example.mydsl.myDsl.ItalicBoldText;
import org.xtext.example.mydsl.myDsl.ItalicText;
import org.xtext.example.mydsl.myDsl.List;
import org.xtext.example.mydsl.myDsl.MainInformation;
import org.xtext.example.mydsl.myDsl.Metadata;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.OrderedList;
import org.xtext.example.mydsl.myDsl.OrderedListItem;
import org.xtext.example.mydsl.myDsl.Template;
import org.xtext.example.mydsl.myDsl.TemplateType;
import org.xtext.example.mydsl.myDsl.TextElement;
import org.xtext.example.mydsl.myDsl.UnformattedText;
import org.xtext.example.mydsl.myDsl.UnorderedList;
import org.xtext.example.mydsl.myDsl.UnorderedListItem;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ABOUT:
				sequence_About(context, (About) semanticObject); 
				return; 
			case MyDslPackage.ABSTRACT_ELEMENT:
				sequence_AbstractElement(context, (AbstractElement) semanticObject); 
				return; 
			case MyDslPackage.ACTUAL_INFORMATION:
				sequence_ActualInformation(context, (ActualInformation) semanticObject); 
				return; 
			case MyDslPackage.BLOCK_QUOTE:
				sequence_BlockQuote(context, (BlockQuote) semanticObject); 
				return; 
			case MyDslPackage.BOLD_TEXT:
				sequence_BoldText(context, (BoldText) semanticObject); 
				return; 
			case MyDslPackage.CATEGORY:
				sequence_Category(context, (Category) semanticObject); 
				return; 
			case MyDslPackage.COMMENT:
				sequence_Comment(context, (Comment) semanticObject); 
				return; 
			case MyDslPackage.DOCUMENT:
				sequence_Document(context, (Document) semanticObject); 
				return; 
			case MyDslPackage.EXTERNAL_LINK:
				sequence_ExternalLink(context, (ExternalLink) semanticObject); 
				return; 
			case MyDslPackage.FILE:
				sequence_File(context, (File) semanticObject); 
				return; 
			case MyDslPackage.FORMATTED_TEXT:
				sequence_FormattedText(context, (FormattedText) semanticObject); 
				return; 
			case MyDslPackage.FORMATTED_TEXT_WITHOUT_LINKS:
				sequence_FormattedTextWithoutLinks(context, (FormattedTextWithoutLinks) semanticObject); 
				return; 
			case MyDslPackage.HEADING:
				sequence_Heading(context, (Heading) semanticObject); 
				return; 
			case MyDslPackage.HEADING1:
				sequence_Heading1(context, (Heading1) semanticObject); 
				return; 
			case MyDslPackage.HEADING2:
				sequence_Heading2(context, (Heading2) semanticObject); 
				return; 
			case MyDslPackage.HEADING3:
				sequence_Heading3(context, (Heading3) semanticObject); 
				return; 
			case MyDslPackage.HEADING4:
				sequence_Heading4(context, (Heading4) semanticObject); 
				return; 
			case MyDslPackage.INTERNAL_LINK:
				sequence_InternalLink(context, (InternalLink) semanticObject); 
				return; 
			case MyDslPackage.ITALIC_BOLD_TEXT:
				sequence_ItalicBoldText(context, (ItalicBoldText) semanticObject); 
				return; 
			case MyDslPackage.ITALIC_TEXT:
				sequence_ItalicText(context, (ItalicText) semanticObject); 
				return; 
			case MyDslPackage.LIST:
				sequence_List(context, (List) semanticObject); 
				return; 
			case MyDslPackage.MAIN_INFORMATION:
				sequence_MainInformation(context, (MainInformation) semanticObject); 
				return; 
			case MyDslPackage.METADATA:
				sequence_Metadata(context, (Metadata) semanticObject); 
				return; 
			case MyDslPackage.ORDERED_LIST:
				sequence_OrderedList(context, (OrderedList) semanticObject); 
				return; 
			case MyDslPackage.ORDERED_LIST_ITEM:
				sequence_OrderedListItem(context, (OrderedListItem) semanticObject); 
				return; 
			case MyDslPackage.TEMPLATE:
				sequence_Template(context, (Template) semanticObject); 
				return; 
			case MyDslPackage.TEMPLATE_TYPE:
				sequence_TemplateType(context, (TemplateType) semanticObject); 
				return; 
			case MyDslPackage.TEXT_ELEMENT:
				sequence_TextElement(context, (TextElement) semanticObject); 
				return; 
			case MyDslPackage.UNFORMATTED_TEXT:
				sequence_UnformattedText(context, (UnformattedText) semanticObject); 
				return; 
			case MyDslPackage.UNORDERED_LIST:
				sequence_UnorderedList(context, (UnorderedList) semanticObject); 
				return; 
			case MyDslPackage.UNORDERED_LIST_ITEM:
				sequence_UnorderedListItem(context, (UnorderedListItem) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     aboutText=UnformattedText
	 */
	protected void sequence_About(EObject context, About semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ABOUT__ABOUT_TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ABOUT__ABOUT_TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAboutAccess().getAboutTextUnformattedTextParserRuleCall_1_0(), semanticObject.getAboutText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (element=Template | element=Heading | element=TextElement | element=Comment)
	 */
	protected void sequence_AbstractElement(EObject context, AbstractElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (informationOnWhat=UnformattedText link=UnformattedText additionalLinks+=UnformattedText*)
	 */
	protected void sequence_ActualInformation(EObject context, ActualInformation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (blockQuoteText=FormattedText additional+=FormattedText*)
	 */
	protected void sequence_BlockQuote(EObject context, BlockQuote semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (boldText=InternalLink | boldText=ExternalLink | boldText=UnformattedText)
	 */
	protected void sequence_BoldText(EObject context, BoldText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     categoryLink=UnformattedText
	 */
	protected void sequence_Category(EObject context, Category semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CATEGORY__CATEGORY_LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CATEGORY__CATEGORY_LINK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCategoryAccess().getCategoryLinkUnformattedTextParserRuleCall_1_0(), semanticObject.getCategoryLink());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     comment=WIKI_COMMENT
	 */
	protected void sequence_Comment(EObject context, Comment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.COMMENT__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.COMMENT__COMMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommentAccess().getCommentWIKI_COMMENTTerminalRuleCall_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (title=Heading1 elements+=AbstractElement* categories+=Category*)
	 */
	protected void sequence_Document(EObject context, Document semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (linkName=UnformattedText renamedLink=FormattedTextWithoutLinks?)
	 */
	protected void sequence_ExternalLink(EObject context, ExternalLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         fileName=UnformattedText 
	 *         (viewType='|thumb' | viewType='|frame' | viewType='|frameless')? 
	 *         (text=FormattedTextWithoutLinks additional+=FormattedTextWithoutLinks*)?
	 *     )
	 */
	protected void sequence_File(EObject context, File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         formattedTextWithoutLinks=ItalicText | 
	 *         formattedTextWithoutLinks=BoldText | 
	 *         formattedTextWithoutLinks=ItalicBoldText | 
	 *         formattedTextWithoutLinks=UnformattedText
	 *     )
	 */
	protected void sequence_FormattedTextWithoutLinks(EObject context, FormattedTextWithoutLinks semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         formattedText=ItalicText | 
	 *         formattedText=BoldText | 
	 *         formattedText=ItalicBoldText | 
	 *         formattedText=InternalLink | 
	 *         formattedText=ExternalLink | 
	 *         formattedText=UnformattedText
	 *     )
	 */
	protected void sequence_FormattedText(EObject context, FormattedText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     heading=FormattedText
	 */
	protected void sequence_Heading1(EObject context, Heading1 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.HEADING1__HEADING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.HEADING1__HEADING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeading1Access().getHeadingFormattedTextParserRuleCall_1_0(), semanticObject.getHeading());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     heading=FormattedText
	 */
	protected void sequence_Heading2(EObject context, Heading2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.HEADING2__HEADING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.HEADING2__HEADING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeading2Access().getHeadingFormattedTextParserRuleCall_1_0(), semanticObject.getHeading());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     heading=FormattedText
	 */
	protected void sequence_Heading3(EObject context, Heading3 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.HEADING3__HEADING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.HEADING3__HEADING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeading3Access().getHeadingFormattedTextParserRuleCall_1_0(), semanticObject.getHeading());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     heading=FormattedText
	 */
	protected void sequence_Heading4(EObject context, Heading4 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.HEADING4__HEADING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.HEADING4__HEADING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeading4Access().getHeadingFormattedTextParserRuleCall_1_0(), semanticObject.getHeading());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (heading=Heading2 | heading=Heading3 | heading=Heading4)
	 */
	protected void sequence_Heading(EObject context, Heading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (linkName=UnformattedText renamedLink=FormattedTextWithoutLinks?)
	 */
	protected void sequence_InternalLink(EObject context, InternalLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (italicBoldText=InternalLink | italicBoldText=ExternalLink | italicBoldText=UnformattedText)
	 */
	protected void sequence_ItalicBoldText(EObject context, ItalicBoldText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (italicText=InternalLink | italicText=ExternalLink | italicText=UnformattedText)
	 */
	protected void sequence_ItalicText(EObject context, ItalicText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (list=OrderedList | list=UnorderedList)
	 */
	protected void sequence_List(EObject context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     link=UnformattedText
	 */
	protected void sequence_MainInformation(EObject context, MainInformation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MAIN_INFORMATION__LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MAIN_INFORMATION__LINK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMainInformationAccess().getLinkUnformattedTextParserRuleCall_1_0(), semanticObject.getLink());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (about=About actualInfo=ActualInformation?)
	 */
	protected void sequence_Metadata(EObject context, Metadata semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (item=FormattedText | item=List)
	 */
	protected void sequence_OrderedListItem(EObject context, OrderedListItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     items+=OrderedListItem
	 */
	protected void sequence_OrderedList(EObject context, OrderedList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Metadata | type=MainInformation)
	 */
	protected void sequence_TemplateType(EObject context, TemplateType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     template=TemplateType
	 */
	protected void sequence_Template(EObject context, Template semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TEMPLATE__TEMPLATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TEMPLATE__TEMPLATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTemplateAccess().getTemplateTemplateTypeParserRuleCall_1_0(), semanticObject.getTemplate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (element=BlockQuote | element=File | element=List | element=FormattedText)
	 */
	protected void sequence_TextElement(EObject context, TextElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     text=CUSTOM_STRING
	 */
	protected void sequence_UnformattedText(EObject context, UnformattedText semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.UNFORMATTED_TEXT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.UNFORMATTED_TEXT__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnformattedTextAccess().getTextCUSTOM_STRINGTerminalRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (item=FormattedText | item=List)
	 */
	protected void sequence_UnorderedListItem(EObject context, UnorderedListItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     items+=UnorderedListItem
	 */
	protected void sequence_UnorderedList(EObject context, UnorderedList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

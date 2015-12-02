package org.hl7.fhir.dstu21.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Wed, Dec 2, 2015 23:24+1100 for FHIR v1.1.0

import java.util.*;

import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.dstu21.model.annotations.ResourceDef;
import org.hl7.fhir.dstu21.model.annotations.SearchParamDefinition;
import org.hl7.fhir.dstu21.model.annotations.Child;
import org.hl7.fhir.dstu21.model.annotations.Description;
import org.hl7.fhir.dstu21.model.annotations.Block;
import org.hl7.fhir.dstu21.model.api.*;
import org.hl7.fhir.exceptions.FHIRException;
/**
 * A guidance response is the formal response to a previous guidance request. It is a derivative of the knowledge response that provides additional information relevant specifically to clinical decision support such as a description of any proposed actions to be taken.
 */
@ResourceDef(name="GuidanceResponse", profile="http://hl7.org/fhir/Profile/GuidanceResponse")
public class GuidanceResponse extends DomainResource {

    public enum GuidanceResponseStatus {
        /**
         * The request was processed successfully
         */
        SUCCESS, 
        /**
         * The request was processed successfully, but more data may result in a more complete evaluation
         */
        DATAREQUESTED, 
        /**
         * The request was processed, but more data is required to complete the evaluation
         */
        DATAREQUIRED, 
        /**
         * The request is currently being processed
         */
        INPROGRESS, 
        /**
         * The request was not processed successfully
         */
        FAILURE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static GuidanceResponseStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("success".equals(codeString))
          return SUCCESS;
        if ("data-requested".equals(codeString))
          return DATAREQUESTED;
        if ("data-required".equals(codeString))
          return DATAREQUIRED;
        if ("in-progress".equals(codeString))
          return INPROGRESS;
        if ("failure".equals(codeString))
          return FAILURE;
        throw new FHIRException("Unknown GuidanceResponseStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case SUCCESS: return "success";
            case DATAREQUESTED: return "data-requested";
            case DATAREQUIRED: return "data-required";
            case INPROGRESS: return "in-progress";
            case FAILURE: return "failure";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case SUCCESS: return "http://hl7.org/fhir/guidance-response-status";
            case DATAREQUESTED: return "http://hl7.org/fhir/guidance-response-status";
            case DATAREQUIRED: return "http://hl7.org/fhir/guidance-response-status";
            case INPROGRESS: return "http://hl7.org/fhir/guidance-response-status";
            case FAILURE: return "http://hl7.org/fhir/guidance-response-status";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case SUCCESS: return "The request was processed successfully";
            case DATAREQUESTED: return "The request was processed successfully, but more data may result in a more complete evaluation";
            case DATAREQUIRED: return "The request was processed, but more data is required to complete the evaluation";
            case INPROGRESS: return "The request is currently being processed";
            case FAILURE: return "The request was not processed successfully";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case SUCCESS: return "Success";
            case DATAREQUESTED: return "Data Requested";
            case DATAREQUIRED: return "Data Required";
            case INPROGRESS: return "In Progress";
            case FAILURE: return "Failure";
            default: return "?";
          }
        }
    }

  public static class GuidanceResponseStatusEnumFactory implements EnumFactory<GuidanceResponseStatus> {
    public GuidanceResponseStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("success".equals(codeString))
          return GuidanceResponseStatus.SUCCESS;
        if ("data-requested".equals(codeString))
          return GuidanceResponseStatus.DATAREQUESTED;
        if ("data-required".equals(codeString))
          return GuidanceResponseStatus.DATAREQUIRED;
        if ("in-progress".equals(codeString))
          return GuidanceResponseStatus.INPROGRESS;
        if ("failure".equals(codeString))
          return GuidanceResponseStatus.FAILURE;
        throw new IllegalArgumentException("Unknown GuidanceResponseStatus code '"+codeString+"'");
        }
        public Enumeration<GuidanceResponseStatus> fromType(Base code) throws FHIRException {
          if (code == null || code.isEmpty())
            return null;
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("success".equals(codeString))
          return new Enumeration<GuidanceResponseStatus>(this, GuidanceResponseStatus.SUCCESS);
        if ("data-requested".equals(codeString))
          return new Enumeration<GuidanceResponseStatus>(this, GuidanceResponseStatus.DATAREQUESTED);
        if ("data-required".equals(codeString))
          return new Enumeration<GuidanceResponseStatus>(this, GuidanceResponseStatus.DATAREQUIRED);
        if ("in-progress".equals(codeString))
          return new Enumeration<GuidanceResponseStatus>(this, GuidanceResponseStatus.INPROGRESS);
        if ("failure".equals(codeString))
          return new Enumeration<GuidanceResponseStatus>(this, GuidanceResponseStatus.FAILURE);
        throw new FHIRException("Unknown GuidanceResponseStatus code '"+codeString+"'");
        }
    public String toCode(GuidanceResponseStatus code) {
      if (code == GuidanceResponseStatus.SUCCESS)
        return "success";
      if (code == GuidanceResponseStatus.DATAREQUESTED)
        return "data-requested";
      if (code == GuidanceResponseStatus.DATAREQUIRED)
        return "data-required";
      if (code == GuidanceResponseStatus.INPROGRESS)
        return "in-progress";
      if (code == GuidanceResponseStatus.FAILURE)
        return "failure";
      return "?";
      }
    }

    public enum GuidanceResponseActionType {
        /**
         * The action is to create a new resource
         */
        CREATE, 
        /**
         * The action is to update an existing resource
         */
        UPDATE, 
        /**
         * The action is to remove an existing resource
         */
        REMOVE, 
        /**
         * The action is to fire a specific event
         */
        FIREEVENT, 
        /**
         * added to help the parsers
         */
        NULL;
        public static GuidanceResponseActionType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("create".equals(codeString))
          return CREATE;
        if ("update".equals(codeString))
          return UPDATE;
        if ("remove".equals(codeString))
          return REMOVE;
        if ("fire-event".equals(codeString))
          return FIREEVENT;
        throw new FHIRException("Unknown GuidanceResponseActionType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case CREATE: return "create";
            case UPDATE: return "update";
            case REMOVE: return "remove";
            case FIREEVENT: return "fire-event";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case CREATE: return "http://hl7.org/fhir/guidance-response-action-type";
            case UPDATE: return "http://hl7.org/fhir/guidance-response-action-type";
            case REMOVE: return "http://hl7.org/fhir/guidance-response-action-type";
            case FIREEVENT: return "http://hl7.org/fhir/guidance-response-action-type";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case CREATE: return "The action is to create a new resource";
            case UPDATE: return "The action is to update an existing resource";
            case REMOVE: return "The action is to remove an existing resource";
            case FIREEVENT: return "The action is to fire a specific event";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case CREATE: return "Create";
            case UPDATE: return "Update";
            case REMOVE: return "Remove";
            case FIREEVENT: return "Fire Event";
            default: return "?";
          }
        }
    }

  public static class GuidanceResponseActionTypeEnumFactory implements EnumFactory<GuidanceResponseActionType> {
    public GuidanceResponseActionType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("create".equals(codeString))
          return GuidanceResponseActionType.CREATE;
        if ("update".equals(codeString))
          return GuidanceResponseActionType.UPDATE;
        if ("remove".equals(codeString))
          return GuidanceResponseActionType.REMOVE;
        if ("fire-event".equals(codeString))
          return GuidanceResponseActionType.FIREEVENT;
        throw new IllegalArgumentException("Unknown GuidanceResponseActionType code '"+codeString+"'");
        }
        public Enumeration<GuidanceResponseActionType> fromType(Base code) throws FHIRException {
          if (code == null || code.isEmpty())
            return null;
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("create".equals(codeString))
          return new Enumeration<GuidanceResponseActionType>(this, GuidanceResponseActionType.CREATE);
        if ("update".equals(codeString))
          return new Enumeration<GuidanceResponseActionType>(this, GuidanceResponseActionType.UPDATE);
        if ("remove".equals(codeString))
          return new Enumeration<GuidanceResponseActionType>(this, GuidanceResponseActionType.REMOVE);
        if ("fire-event".equals(codeString))
          return new Enumeration<GuidanceResponseActionType>(this, GuidanceResponseActionType.FIREEVENT);
        throw new FHIRException("Unknown GuidanceResponseActionType code '"+codeString+"'");
        }
    public String toCode(GuidanceResponseActionType code) {
      if (code == GuidanceResponseActionType.CREATE)
        return "create";
      if (code == GuidanceResponseActionType.UPDATE)
        return "update";
      if (code == GuidanceResponseActionType.REMOVE)
        return "remove";
      if (code == GuidanceResponseActionType.FIREEVENT)
        return "fire-event";
      return "?";
      }
    }

    @Block()
    public static class GuidanceResponseActionComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A unique identifier for the action.
         */
        @Child(name = "actionIdentifier", type = {Identifier.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="", formalDefinition="A unique identifier for the action." )
        protected Identifier actionIdentifier;

        /**
         * A user-visible number for the action.
         */
        @Child(name = "number", type = {StringType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="", formalDefinition="A user-visible number for the action." )
        protected StringType number;

        /**
         * Supporting evidence for the action.
         */
        @Child(name = "supportingEvidence", type = {Attachment.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="", formalDefinition="Supporting evidence for the action." )
        protected List<Attachment> supportingEvidence;

        /**
         * Supporting documentation for the action.
         */
        @Child(name = "documentation", type = {Attachment.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="", formalDefinition="Supporting documentation for the action." )
        protected List<Attachment> documentation;

        /**
         * The participant in the action.
         */
        @Child(name = "participant", type = {Patient.class, Person.class, Practitioner.class, RelatedPerson.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="", formalDefinition="The participant in the action." )
        protected List<Reference> participant;
        /**
         * The actual objects that are the target of the reference (The participant in the action.)
         */
        protected List<Resource> participantTarget;


        /**
         * The title of the action.
         */
        @Child(name = "title", type = {StringType.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="", formalDefinition="The title of the action." )
        protected StringType title;

        /**
         * A short description of the action.
         */
        @Child(name = "description", type = {StringType.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="", formalDefinition="A short description of the action." )
        protected StringType description;

        /**
         * A text equivalent of the action to be performed.
         */
        @Child(name = "textEquivalent", type = {StringType.class}, order=8, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="", formalDefinition="A text equivalent of the action to be performed." )
        protected StringType textEquivalent;

        /**
         * Concepts associated with the action.
         */
        @Child(name = "concept", type = {CodeableConcept.class}, order=9, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="", formalDefinition="Concepts associated with the action." )
        protected List<CodeableConcept> concept;

        /**
         * The type of action to perform (create, update, remove).
         */
        @Child(name = "type", type = {CodeType.class}, order=10, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="create | update | remove | fire-event", formalDefinition="The type of action to perform (create, update, remove)." )
        protected Enumeration<GuidanceResponseActionType> type;

        /**
         * The resource that is the target of the action (e.g. CommunicationRequest).
         */
        @Child(name = "resource", type = {}, order=11, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="", formalDefinition="The resource that is the target of the action (e.g. CommunicationRequest)." )
        protected Reference resource;

        /**
         * The actual object that is the target of the reference (The resource that is the target of the action (e.g. CommunicationRequest).)
         */
        protected Resource resourceTarget;

        /**
         * Sub actions.
         */
        @Child(name = "actions", type = {GuidanceResponseActionComponent.class}, order=12, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="", formalDefinition="Sub actions." )
        protected List<GuidanceResponseActionComponent> actions;

        private static final long serialVersionUID = 1245922408L;

    /*
     * Constructor
     */
      public GuidanceResponseActionComponent() {
        super();
      }

        /**
         * @return {@link #actionIdentifier} (A unique identifier for the action.)
         */
        public Identifier getActionIdentifier() { 
          if (this.actionIdentifier == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create GuidanceResponseActionComponent.actionIdentifier");
            else if (Configuration.doAutoCreate())
              this.actionIdentifier = new Identifier(); // cc
          return this.actionIdentifier;
        }

        public boolean hasActionIdentifier() { 
          return this.actionIdentifier != null && !this.actionIdentifier.isEmpty();
        }

        /**
         * @param value {@link #actionIdentifier} (A unique identifier for the action.)
         */
        public GuidanceResponseActionComponent setActionIdentifier(Identifier value) { 
          this.actionIdentifier = value;
          return this;
        }

        /**
         * @return {@link #number} (A user-visible number for the action.). This is the underlying object with id, value and extensions. The accessor "getNumber" gives direct access to the value
         */
        public StringType getNumberElement() { 
          if (this.number == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create GuidanceResponseActionComponent.number");
            else if (Configuration.doAutoCreate())
              this.number = new StringType(); // bb
          return this.number;
        }

        public boolean hasNumberElement() { 
          return this.number != null && !this.number.isEmpty();
        }

        public boolean hasNumber() { 
          return this.number != null && !this.number.isEmpty();
        }

        /**
         * @param value {@link #number} (A user-visible number for the action.). This is the underlying object with id, value and extensions. The accessor "getNumber" gives direct access to the value
         */
        public GuidanceResponseActionComponent setNumberElement(StringType value) { 
          this.number = value;
          return this;
        }

        /**
         * @return A user-visible number for the action.
         */
        public String getNumber() { 
          return this.number == null ? null : this.number.getValue();
        }

        /**
         * @param value A user-visible number for the action.
         */
        public GuidanceResponseActionComponent setNumber(String value) { 
          if (Utilities.noString(value))
            this.number = null;
          else {
            if (this.number == null)
              this.number = new StringType();
            this.number.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #supportingEvidence} (Supporting evidence for the action.)
         */
        public List<Attachment> getSupportingEvidence() { 
          if (this.supportingEvidence == null)
            this.supportingEvidence = new ArrayList<Attachment>();
          return this.supportingEvidence;
        }

        public boolean hasSupportingEvidence() { 
          if (this.supportingEvidence == null)
            return false;
          for (Attachment item : this.supportingEvidence)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #supportingEvidence} (Supporting evidence for the action.)
         */
    // syntactic sugar
        public Attachment addSupportingEvidence() { //3
          Attachment t = new Attachment();
          if (this.supportingEvidence == null)
            this.supportingEvidence = new ArrayList<Attachment>();
          this.supportingEvidence.add(t);
          return t;
        }

    // syntactic sugar
        public GuidanceResponseActionComponent addSupportingEvidence(Attachment t) { //3
          if (t == null)
            return this;
          if (this.supportingEvidence == null)
            this.supportingEvidence = new ArrayList<Attachment>();
          this.supportingEvidence.add(t);
          return this;
        }

        /**
         * @return {@link #documentation} (Supporting documentation for the action.)
         */
        public List<Attachment> getDocumentation() { 
          if (this.documentation == null)
            this.documentation = new ArrayList<Attachment>();
          return this.documentation;
        }

        public boolean hasDocumentation() { 
          if (this.documentation == null)
            return false;
          for (Attachment item : this.documentation)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #documentation} (Supporting documentation for the action.)
         */
    // syntactic sugar
        public Attachment addDocumentation() { //3
          Attachment t = new Attachment();
          if (this.documentation == null)
            this.documentation = new ArrayList<Attachment>();
          this.documentation.add(t);
          return t;
        }

    // syntactic sugar
        public GuidanceResponseActionComponent addDocumentation(Attachment t) { //3
          if (t == null)
            return this;
          if (this.documentation == null)
            this.documentation = new ArrayList<Attachment>();
          this.documentation.add(t);
          return this;
        }

        /**
         * @return {@link #participant} (The participant in the action.)
         */
        public List<Reference> getParticipant() { 
          if (this.participant == null)
            this.participant = new ArrayList<Reference>();
          return this.participant;
        }

        public boolean hasParticipant() { 
          if (this.participant == null)
            return false;
          for (Reference item : this.participant)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #participant} (The participant in the action.)
         */
    // syntactic sugar
        public Reference addParticipant() { //3
          Reference t = new Reference();
          if (this.participant == null)
            this.participant = new ArrayList<Reference>();
          this.participant.add(t);
          return t;
        }

    // syntactic sugar
        public GuidanceResponseActionComponent addParticipant(Reference t) { //3
          if (t == null)
            return this;
          if (this.participant == null)
            this.participant = new ArrayList<Reference>();
          this.participant.add(t);
          return this;
        }

        /**
         * @return {@link #participant} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. The participant in the action.)
         */
        public List<Resource> getParticipantTarget() { 
          if (this.participantTarget == null)
            this.participantTarget = new ArrayList<Resource>();
          return this.participantTarget;
        }

        /**
         * @return {@link #title} (The title of the action.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
         */
        public StringType getTitleElement() { 
          if (this.title == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create GuidanceResponseActionComponent.title");
            else if (Configuration.doAutoCreate())
              this.title = new StringType(); // bb
          return this.title;
        }

        public boolean hasTitleElement() { 
          return this.title != null && !this.title.isEmpty();
        }

        public boolean hasTitle() { 
          return this.title != null && !this.title.isEmpty();
        }

        /**
         * @param value {@link #title} (The title of the action.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
         */
        public GuidanceResponseActionComponent setTitleElement(StringType value) { 
          this.title = value;
          return this;
        }

        /**
         * @return The title of the action.
         */
        public String getTitle() { 
          return this.title == null ? null : this.title.getValue();
        }

        /**
         * @param value The title of the action.
         */
        public GuidanceResponseActionComponent setTitle(String value) { 
          if (Utilities.noString(value))
            this.title = null;
          else {
            if (this.title == null)
              this.title = new StringType();
            this.title.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #description} (A short description of the action.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create GuidanceResponseActionComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (A short description of the action.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public GuidanceResponseActionComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return A short description of the action.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value A short description of the action.
         */
        public GuidanceResponseActionComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #textEquivalent} (A text equivalent of the action to be performed.). This is the underlying object with id, value and extensions. The accessor "getTextEquivalent" gives direct access to the value
         */
        public StringType getTextEquivalentElement() { 
          if (this.textEquivalent == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create GuidanceResponseActionComponent.textEquivalent");
            else if (Configuration.doAutoCreate())
              this.textEquivalent = new StringType(); // bb
          return this.textEquivalent;
        }

        public boolean hasTextEquivalentElement() { 
          return this.textEquivalent != null && !this.textEquivalent.isEmpty();
        }

        public boolean hasTextEquivalent() { 
          return this.textEquivalent != null && !this.textEquivalent.isEmpty();
        }

        /**
         * @param value {@link #textEquivalent} (A text equivalent of the action to be performed.). This is the underlying object with id, value and extensions. The accessor "getTextEquivalent" gives direct access to the value
         */
        public GuidanceResponseActionComponent setTextEquivalentElement(StringType value) { 
          this.textEquivalent = value;
          return this;
        }

        /**
         * @return A text equivalent of the action to be performed.
         */
        public String getTextEquivalent() { 
          return this.textEquivalent == null ? null : this.textEquivalent.getValue();
        }

        /**
         * @param value A text equivalent of the action to be performed.
         */
        public GuidanceResponseActionComponent setTextEquivalent(String value) { 
          if (Utilities.noString(value))
            this.textEquivalent = null;
          else {
            if (this.textEquivalent == null)
              this.textEquivalent = new StringType();
            this.textEquivalent.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #concept} (Concepts associated with the action.)
         */
        public List<CodeableConcept> getConcept() { 
          if (this.concept == null)
            this.concept = new ArrayList<CodeableConcept>();
          return this.concept;
        }

        public boolean hasConcept() { 
          if (this.concept == null)
            return false;
          for (CodeableConcept item : this.concept)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #concept} (Concepts associated with the action.)
         */
    // syntactic sugar
        public CodeableConcept addConcept() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.concept == null)
            this.concept = new ArrayList<CodeableConcept>();
          this.concept.add(t);
          return t;
        }

    // syntactic sugar
        public GuidanceResponseActionComponent addConcept(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.concept == null)
            this.concept = new ArrayList<CodeableConcept>();
          this.concept.add(t);
          return this;
        }

        /**
         * @return {@link #type} (The type of action to perform (create, update, remove).). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
         */
        public Enumeration<GuidanceResponseActionType> getTypeElement() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create GuidanceResponseActionComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new Enumeration<GuidanceResponseActionType>(new GuidanceResponseActionTypeEnumFactory()); // bb
          return this.type;
        }

        public boolean hasTypeElement() { 
          return this.type != null && !this.type.isEmpty();
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (The type of action to perform (create, update, remove).). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
         */
        public GuidanceResponseActionComponent setTypeElement(Enumeration<GuidanceResponseActionType> value) { 
          this.type = value;
          return this;
        }

        /**
         * @return The type of action to perform (create, update, remove).
         */
        public GuidanceResponseActionType getType() { 
          return this.type == null ? null : this.type.getValue();
        }

        /**
         * @param value The type of action to perform (create, update, remove).
         */
        public GuidanceResponseActionComponent setType(GuidanceResponseActionType value) { 
          if (value == null)
            this.type = null;
          else {
            if (this.type == null)
              this.type = new Enumeration<GuidanceResponseActionType>(new GuidanceResponseActionTypeEnumFactory());
            this.type.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #resource} (The resource that is the target of the action (e.g. CommunicationRequest).)
         */
        public Reference getResource() { 
          if (this.resource == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create GuidanceResponseActionComponent.resource");
            else if (Configuration.doAutoCreate())
              this.resource = new Reference(); // cc
          return this.resource;
        }

        public boolean hasResource() { 
          return this.resource != null && !this.resource.isEmpty();
        }

        /**
         * @param value {@link #resource} (The resource that is the target of the action (e.g. CommunicationRequest).)
         */
        public GuidanceResponseActionComponent setResource(Reference value) { 
          this.resource = value;
          return this;
        }

        /**
         * @return {@link #resource} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The resource that is the target of the action (e.g. CommunicationRequest).)
         */
        public Resource getResourceTarget() { 
          return this.resourceTarget;
        }

        /**
         * @param value {@link #resource} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The resource that is the target of the action (e.g. CommunicationRequest).)
         */
        public GuidanceResponseActionComponent setResourceTarget(Resource value) { 
          this.resourceTarget = value;
          return this;
        }

        /**
         * @return {@link #actions} (Sub actions.)
         */
        public List<GuidanceResponseActionComponent> getActions() { 
          if (this.actions == null)
            this.actions = new ArrayList<GuidanceResponseActionComponent>();
          return this.actions;
        }

        public boolean hasActions() { 
          if (this.actions == null)
            return false;
          for (GuidanceResponseActionComponent item : this.actions)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #actions} (Sub actions.)
         */
    // syntactic sugar
        public GuidanceResponseActionComponent addActions() { //3
          GuidanceResponseActionComponent t = new GuidanceResponseActionComponent();
          if (this.actions == null)
            this.actions = new ArrayList<GuidanceResponseActionComponent>();
          this.actions.add(t);
          return t;
        }

    // syntactic sugar
        public GuidanceResponseActionComponent addActions(GuidanceResponseActionComponent t) { //3
          if (t == null)
            return this;
          if (this.actions == null)
            this.actions = new ArrayList<GuidanceResponseActionComponent>();
          this.actions.add(t);
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("actionIdentifier", "Identifier", "A unique identifier for the action.", 0, java.lang.Integer.MAX_VALUE, actionIdentifier));
          childrenList.add(new Property("number", "string", "A user-visible number for the action.", 0, java.lang.Integer.MAX_VALUE, number));
          childrenList.add(new Property("supportingEvidence", "Attachment", "Supporting evidence for the action.", 0, java.lang.Integer.MAX_VALUE, supportingEvidence));
          childrenList.add(new Property("documentation", "Attachment", "Supporting documentation for the action.", 0, java.lang.Integer.MAX_VALUE, documentation));
          childrenList.add(new Property("participant", "Reference(Patient|Person|Practitioner|RelatedPerson)", "The participant in the action.", 0, java.lang.Integer.MAX_VALUE, participant));
          childrenList.add(new Property("title", "string", "The title of the action.", 0, java.lang.Integer.MAX_VALUE, title));
          childrenList.add(new Property("description", "string", "A short description of the action.", 0, java.lang.Integer.MAX_VALUE, description));
          childrenList.add(new Property("textEquivalent", "string", "A text equivalent of the action to be performed.", 0, java.lang.Integer.MAX_VALUE, textEquivalent));
          childrenList.add(new Property("concept", "CodeableConcept", "Concepts associated with the action.", 0, java.lang.Integer.MAX_VALUE, concept));
          childrenList.add(new Property("type", "code", "The type of action to perform (create, update, remove).", 0, java.lang.Integer.MAX_VALUE, type));
          childrenList.add(new Property("resource", "Reference(Any)", "The resource that is the target of the action (e.g. CommunicationRequest).", 0, java.lang.Integer.MAX_VALUE, resource));
          childrenList.add(new Property("actions", "@GuidanceResponse.action", "Sub actions.", 0, java.lang.Integer.MAX_VALUE, actions));
        }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("actionIdentifier"))
          this.actionIdentifier = castToIdentifier(value); // Identifier
        else if (name.equals("number"))
          this.number = castToString(value); // StringType
        else if (name.equals("supportingEvidence"))
          this.getSupportingEvidence().add(castToAttachment(value));
        else if (name.equals("documentation"))
          this.getDocumentation().add(castToAttachment(value));
        else if (name.equals("participant"))
          this.getParticipant().add(castToReference(value));
        else if (name.equals("title"))
          this.title = castToString(value); // StringType
        else if (name.equals("description"))
          this.description = castToString(value); // StringType
        else if (name.equals("textEquivalent"))
          this.textEquivalent = castToString(value); // StringType
        else if (name.equals("concept"))
          this.getConcept().add(castToCodeableConcept(value));
        else if (name.equals("type"))
          this.type = new GuidanceResponseActionTypeEnumFactory().fromType(value); // Enumeration<GuidanceResponseActionType>
        else if (name.equals("resource"))
          this.resource = castToReference(value); // Reference
        else if (name.equals("actions"))
          this.getActions().add((GuidanceResponseActionComponent) value);
        else
          super.setProperty(name, value);
      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("actionIdentifier")) {
          this.actionIdentifier = new Identifier();
          return this.actionIdentifier;
        }
        else if (name.equals("number")) {
          throw new FHIRException("Cannot call addChild on a primitive type GuidanceResponse.number");
        }
        else if (name.equals("supportingEvidence")) {
          return addSupportingEvidence();
        }
        else if (name.equals("documentation")) {
          return addDocumentation();
        }
        else if (name.equals("participant")) {
          return addParticipant();
        }
        else if (name.equals("title")) {
          throw new FHIRException("Cannot call addChild on a primitive type GuidanceResponse.title");
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type GuidanceResponse.description");
        }
        else if (name.equals("textEquivalent")) {
          throw new FHIRException("Cannot call addChild on a primitive type GuidanceResponse.textEquivalent");
        }
        else if (name.equals("concept")) {
          return addConcept();
        }
        else if (name.equals("type")) {
          throw new FHIRException("Cannot call addChild on a primitive type GuidanceResponse.type");
        }
        else if (name.equals("resource")) {
          this.resource = new Reference();
          return this.resource;
        }
        else if (name.equals("actions")) {
          return addActions();
        }
        else
          return super.addChild(name);
      }

      public GuidanceResponseActionComponent copy() {
        GuidanceResponseActionComponent dst = new GuidanceResponseActionComponent();
        copyValues(dst);
        dst.actionIdentifier = actionIdentifier == null ? null : actionIdentifier.copy();
        dst.number = number == null ? null : number.copy();
        if (supportingEvidence != null) {
          dst.supportingEvidence = new ArrayList<Attachment>();
          for (Attachment i : supportingEvidence)
            dst.supportingEvidence.add(i.copy());
        };
        if (documentation != null) {
          dst.documentation = new ArrayList<Attachment>();
          for (Attachment i : documentation)
            dst.documentation.add(i.copy());
        };
        if (participant != null) {
          dst.participant = new ArrayList<Reference>();
          for (Reference i : participant)
            dst.participant.add(i.copy());
        };
        dst.title = title == null ? null : title.copy();
        dst.description = description == null ? null : description.copy();
        dst.textEquivalent = textEquivalent == null ? null : textEquivalent.copy();
        if (concept != null) {
          dst.concept = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : concept)
            dst.concept.add(i.copy());
        };
        dst.type = type == null ? null : type.copy();
        dst.resource = resource == null ? null : resource.copy();
        if (actions != null) {
          dst.actions = new ArrayList<GuidanceResponseActionComponent>();
          for (GuidanceResponseActionComponent i : actions)
            dst.actions.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof GuidanceResponseActionComponent))
          return false;
        GuidanceResponseActionComponent o = (GuidanceResponseActionComponent) other;
        return compareDeep(actionIdentifier, o.actionIdentifier, true) && compareDeep(number, o.number, true)
           && compareDeep(supportingEvidence, o.supportingEvidence, true) && compareDeep(documentation, o.documentation, true)
           && compareDeep(participant, o.participant, true) && compareDeep(title, o.title, true) && compareDeep(description, o.description, true)
           && compareDeep(textEquivalent, o.textEquivalent, true) && compareDeep(concept, o.concept, true)
           && compareDeep(type, o.type, true) && compareDeep(resource, o.resource, true) && compareDeep(actions, o.actions, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof GuidanceResponseActionComponent))
          return false;
        GuidanceResponseActionComponent o = (GuidanceResponseActionComponent) other;
        return compareValues(number, o.number, true) && compareValues(title, o.title, true) && compareValues(description, o.description, true)
           && compareValues(textEquivalent, o.textEquivalent, true) && compareValues(type, o.type, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (actionIdentifier == null || actionIdentifier.isEmpty()) && (number == null || number.isEmpty())
           && (supportingEvidence == null || supportingEvidence.isEmpty()) && (documentation == null || documentation.isEmpty())
           && (participant == null || participant.isEmpty()) && (title == null || title.isEmpty()) && (description == null || description.isEmpty())
           && (textEquivalent == null || textEquivalent.isEmpty()) && (concept == null || concept.isEmpty())
           && (type == null || type.isEmpty()) && (resource == null || resource.isEmpty()) && (actions == null || actions.isEmpty())
          ;
      }

  public String fhirType() {
    return "GuidanceResponse.action";

  }

  }

    /**
     * The id of the request associated with this response. If an id was provided as part of the request, it will be provided here to enable the requester to more easily identify the response in a multi-request scenario.
     */
    @Child(name = "requestId", type = {StringType.class}, order=0, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="The id of the request associated with this response, if any", formalDefinition="The id of the request associated with this response. If an id was provided as part of the request, it will be provided here to enable the requester to more easily identify the response in a multi-request scenario." )
    protected StringType requestId;

    /**
     * A reference to a knowledge module involved in an interaction.
     */
    @Child(name = "module", type = {DecisionSupportServiceModule.class, DecisionSupportRule.class}, order=1, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="A reference to a knowledge module", formalDefinition="A reference to a knowledge module involved in an interaction." )
    protected Reference module;

    /**
     * The actual object that is the target of the reference (A reference to a knowledge module involved in an interaction.)
     */
    protected Resource moduleTarget;

    /**
     * The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.
     */
    @Child(name = "status", type = {CodeType.class}, order=2, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="success | data-requested | data-required | in-progress | failure", formalDefinition="The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information." )
    protected Enumeration<GuidanceResponseStatus> status;

    /**
     * Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.
     */
    @Child(name = "evaluationMessage", type = {OperationOutcome.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Messages resulting from the evaluation of the artifact or artifacts", formalDefinition="Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element." )
    protected List<Reference> evaluationMessage;
    /**
     * The actual objects that are the target of the reference (Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.)
     */
    protected List<OperationOutcome> evaluationMessageTarget;


    /**
     * The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element.
     */
    @Child(name = "outputParameters", type = {Parameters.class}, order=4, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="The output parameters of the evaluation, if any", formalDefinition="The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element." )
    protected Reference outputParameters;

    /**
     * The actual object that is the target of the reference (The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element.)
     */
    protected Parameters outputParametersTarget;

    /**
     * The actions, if any, produced by the evaluation of the artifact.
     */
    @Child(name = "action", type = {}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="", formalDefinition="The actions, if any, produced by the evaluation of the artifact." )
    protected List<GuidanceResponseActionComponent> action;

    private static final long serialVersionUID = -2105369308L;

  /*
   * Constructor
   */
    public GuidanceResponse() {
      super();
    }

  /*
   * Constructor
   */
    public GuidanceResponse(Reference module, Enumeration<GuidanceResponseStatus> status) {
      super();
      this.module = module;
      this.status = status;
    }

    /**
     * @return {@link #requestId} (The id of the request associated with this response. If an id was provided as part of the request, it will be provided here to enable the requester to more easily identify the response in a multi-request scenario.). This is the underlying object with id, value and extensions. The accessor "getRequestId" gives direct access to the value
     */
    public StringType getRequestIdElement() { 
      if (this.requestId == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create GuidanceResponse.requestId");
        else if (Configuration.doAutoCreate())
          this.requestId = new StringType(); // bb
      return this.requestId;
    }

    public boolean hasRequestIdElement() { 
      return this.requestId != null && !this.requestId.isEmpty();
    }

    public boolean hasRequestId() { 
      return this.requestId != null && !this.requestId.isEmpty();
    }

    /**
     * @param value {@link #requestId} (The id of the request associated with this response. If an id was provided as part of the request, it will be provided here to enable the requester to more easily identify the response in a multi-request scenario.). This is the underlying object with id, value and extensions. The accessor "getRequestId" gives direct access to the value
     */
    public GuidanceResponse setRequestIdElement(StringType value) { 
      this.requestId = value;
      return this;
    }

    /**
     * @return The id of the request associated with this response. If an id was provided as part of the request, it will be provided here to enable the requester to more easily identify the response in a multi-request scenario.
     */
    public String getRequestId() { 
      return this.requestId == null ? null : this.requestId.getValue();
    }

    /**
     * @param value The id of the request associated with this response. If an id was provided as part of the request, it will be provided here to enable the requester to more easily identify the response in a multi-request scenario.
     */
    public GuidanceResponse setRequestId(String value) { 
      if (Utilities.noString(value))
        this.requestId = null;
      else {
        if (this.requestId == null)
          this.requestId = new StringType();
        this.requestId.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #module} (A reference to a knowledge module involved in an interaction.)
     */
    public Reference getModule() { 
      if (this.module == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create GuidanceResponse.module");
        else if (Configuration.doAutoCreate())
          this.module = new Reference(); // cc
      return this.module;
    }

    public boolean hasModule() { 
      return this.module != null && !this.module.isEmpty();
    }

    /**
     * @param value {@link #module} (A reference to a knowledge module involved in an interaction.)
     */
    public GuidanceResponse setModule(Reference value) { 
      this.module = value;
      return this;
    }

    /**
     * @return {@link #module} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A reference to a knowledge module involved in an interaction.)
     */
    public Resource getModuleTarget() { 
      return this.moduleTarget;
    }

    /**
     * @param value {@link #module} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A reference to a knowledge module involved in an interaction.)
     */
    public GuidanceResponse setModuleTarget(Resource value) { 
      this.moduleTarget = value;
      return this;
    }

    /**
     * @return {@link #status} (The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<GuidanceResponseStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create GuidanceResponse.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<GuidanceResponseStatus>(new GuidanceResponseStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public GuidanceResponse setStatusElement(Enumeration<GuidanceResponseStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.
     */
    public GuidanceResponseStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.
     */
    public GuidanceResponse setStatus(GuidanceResponseStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<GuidanceResponseStatus>(new GuidanceResponseStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #evaluationMessage} (Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.)
     */
    public List<Reference> getEvaluationMessage() { 
      if (this.evaluationMessage == null)
        this.evaluationMessage = new ArrayList<Reference>();
      return this.evaluationMessage;
    }

    public boolean hasEvaluationMessage() { 
      if (this.evaluationMessage == null)
        return false;
      for (Reference item : this.evaluationMessage)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #evaluationMessage} (Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.)
     */
    // syntactic sugar
    public Reference addEvaluationMessage() { //3
      Reference t = new Reference();
      if (this.evaluationMessage == null)
        this.evaluationMessage = new ArrayList<Reference>();
      this.evaluationMessage.add(t);
      return t;
    }

    // syntactic sugar
    public GuidanceResponse addEvaluationMessage(Reference t) { //3
      if (t == null)
        return this;
      if (this.evaluationMessage == null)
        this.evaluationMessage = new ArrayList<Reference>();
      this.evaluationMessage.add(t);
      return this;
    }

    /**
     * @return {@link #evaluationMessage} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.)
     */
    public List<OperationOutcome> getEvaluationMessageTarget() { 
      if (this.evaluationMessageTarget == null)
        this.evaluationMessageTarget = new ArrayList<OperationOutcome>();
      return this.evaluationMessageTarget;
    }

    // syntactic sugar
    /**
     * @return {@link #evaluationMessage} (Add an actual object that is the target of the reference. The reference library doesn't use these, but you can use this to hold the resources if you resolvethemt. Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.)
     */
    public OperationOutcome addEvaluationMessageTarget() { 
      OperationOutcome r = new OperationOutcome();
      if (this.evaluationMessageTarget == null)
        this.evaluationMessageTarget = new ArrayList<OperationOutcome>();
      this.evaluationMessageTarget.add(r);
      return r;
    }

    /**
     * @return {@link #outputParameters} (The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element.)
     */
    public Reference getOutputParameters() { 
      if (this.outputParameters == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create GuidanceResponse.outputParameters");
        else if (Configuration.doAutoCreate())
          this.outputParameters = new Reference(); // cc
      return this.outputParameters;
    }

    public boolean hasOutputParameters() { 
      return this.outputParameters != null && !this.outputParameters.isEmpty();
    }

    /**
     * @param value {@link #outputParameters} (The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element.)
     */
    public GuidanceResponse setOutputParameters(Reference value) { 
      this.outputParameters = value;
      return this;
    }

    /**
     * @return {@link #outputParameters} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element.)
     */
    public Parameters getOutputParametersTarget() { 
      if (this.outputParametersTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create GuidanceResponse.outputParameters");
        else if (Configuration.doAutoCreate())
          this.outputParametersTarget = new Parameters(); // aa
      return this.outputParametersTarget;
    }

    /**
     * @param value {@link #outputParameters} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element.)
     */
    public GuidanceResponse setOutputParametersTarget(Parameters value) { 
      this.outputParametersTarget = value;
      return this;
    }

    /**
     * @return {@link #action} (The actions, if any, produced by the evaluation of the artifact.)
     */
    public List<GuidanceResponseActionComponent> getAction() { 
      if (this.action == null)
        this.action = new ArrayList<GuidanceResponseActionComponent>();
      return this.action;
    }

    public boolean hasAction() { 
      if (this.action == null)
        return false;
      for (GuidanceResponseActionComponent item : this.action)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #action} (The actions, if any, produced by the evaluation of the artifact.)
     */
    // syntactic sugar
    public GuidanceResponseActionComponent addAction() { //3
      GuidanceResponseActionComponent t = new GuidanceResponseActionComponent();
      if (this.action == null)
        this.action = new ArrayList<GuidanceResponseActionComponent>();
      this.action.add(t);
      return t;
    }

    // syntactic sugar
    public GuidanceResponse addAction(GuidanceResponseActionComponent t) { //3
      if (t == null)
        return this;
      if (this.action == null)
        this.action = new ArrayList<GuidanceResponseActionComponent>();
      this.action.add(t);
      return this;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("requestId", "string", "The id of the request associated with this response. If an id was provided as part of the request, it will be provided here to enable the requester to more easily identify the response in a multi-request scenario.", 0, java.lang.Integer.MAX_VALUE, requestId));
        childrenList.add(new Property("module", "Reference(DecisionSupportServiceModule|DecisionSupportRule)", "A reference to a knowledge module involved in an interaction.", 0, java.lang.Integer.MAX_VALUE, module));
        childrenList.add(new Property("status", "code", "The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("evaluationMessage", "Reference(OperationOutcome)", "Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.", 0, java.lang.Integer.MAX_VALUE, evaluationMessage));
        childrenList.add(new Property("outputParameters", "Reference(Parameters)", "The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element.", 0, java.lang.Integer.MAX_VALUE, outputParameters));
        childrenList.add(new Property("action", "", "The actions, if any, produced by the evaluation of the artifact.", 0, java.lang.Integer.MAX_VALUE, action));
      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("requestId"))
          this.requestId = castToString(value); // StringType
        else if (name.equals("module"))
          this.module = castToReference(value); // Reference
        else if (name.equals("status"))
          this.status = new GuidanceResponseStatusEnumFactory().fromType(value); // Enumeration<GuidanceResponseStatus>
        else if (name.equals("evaluationMessage"))
          this.getEvaluationMessage().add(castToReference(value));
        else if (name.equals("outputParameters"))
          this.outputParameters = castToReference(value); // Reference
        else if (name.equals("action"))
          this.getAction().add((GuidanceResponseActionComponent) value);
        else
          super.setProperty(name, value);
      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("requestId")) {
          throw new FHIRException("Cannot call addChild on a primitive type GuidanceResponse.requestId");
        }
        else if (name.equals("module")) {
          this.module = new Reference();
          return this.module;
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type GuidanceResponse.status");
        }
        else if (name.equals("evaluationMessage")) {
          return addEvaluationMessage();
        }
        else if (name.equals("outputParameters")) {
          this.outputParameters = new Reference();
          return this.outputParameters;
        }
        else if (name.equals("action")) {
          return addAction();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "GuidanceResponse";

  }

      public GuidanceResponse copy() {
        GuidanceResponse dst = new GuidanceResponse();
        copyValues(dst);
        dst.requestId = requestId == null ? null : requestId.copy();
        dst.module = module == null ? null : module.copy();
        dst.status = status == null ? null : status.copy();
        if (evaluationMessage != null) {
          dst.evaluationMessage = new ArrayList<Reference>();
          for (Reference i : evaluationMessage)
            dst.evaluationMessage.add(i.copy());
        };
        dst.outputParameters = outputParameters == null ? null : outputParameters.copy();
        if (action != null) {
          dst.action = new ArrayList<GuidanceResponseActionComponent>();
          for (GuidanceResponseActionComponent i : action)
            dst.action.add(i.copy());
        };
        return dst;
      }

      protected GuidanceResponse typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof GuidanceResponse))
          return false;
        GuidanceResponse o = (GuidanceResponse) other;
        return compareDeep(requestId, o.requestId, true) && compareDeep(module, o.module, true) && compareDeep(status, o.status, true)
           && compareDeep(evaluationMessage, o.evaluationMessage, true) && compareDeep(outputParameters, o.outputParameters, true)
           && compareDeep(action, o.action, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof GuidanceResponse))
          return false;
        GuidanceResponse o = (GuidanceResponse) other;
        return compareValues(requestId, o.requestId, true) && compareValues(status, o.status, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (requestId == null || requestId.isEmpty()) && (module == null || module.isEmpty())
           && (status == null || status.isEmpty()) && (evaluationMessage == null || evaluationMessage.isEmpty())
           && (outputParameters == null || outputParameters.isEmpty()) && (action == null || action.isEmpty())
          ;
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.GuidanceResponse;
   }


}


//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.01.21 at 01:52:19 PM IST
//
package org.netbeans.jpa.modeler.spec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.StringUtils;
import org.netbeans.jpa.modeler.spec.extend.AssociationOverrideHandler;
import org.netbeans.jpa.modeler.spec.extend.AttributeOverrideHandler;
import org.netbeans.jpa.modeler.spec.extend.CollectionTypeHandler;
import org.netbeans.jpa.modeler.spec.extend.ColumnHandler;
import org.netbeans.jpa.modeler.spec.extend.CompositionAttribute;
import org.netbeans.jpa.modeler.spec.extend.FetchTypeHandler;
import org.netbeans.jpa.modeler.spec.jaxb.JaxbVariableType;
import org.netbeans.jpa.modeler.spec.validator.override.AssociationValidator;
import org.netbeans.jpa.modeler.spec.validator.override.AttributeValidator;
import org.netbeans.jpa.source.JavaSourceParserUtil;
import org.netbeans.modeler.core.NBModelerUtil;

/**
 *
 *
 * @Target({METHOD, FIELD}) @Retention(RUNTIME) public @interface
 * ElementCollection { Class targetClass() default void.class; FetchType fetch()
 * default LAZY; }
 *
 *
 *
 * <p>
 * Java class for element-collection complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="element-collection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="order-by" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}order-by" minOccurs="0"/>
 *           &lt;element name="order-column" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}order-column" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="map-key" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}map-key" minOccurs="0"/>
 *           &lt;sequence>
 *             &lt;element name="map-key-class" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}map-key-class" minOccurs="0"/>
 *             &lt;choice>
 *               &lt;element name="map-key-temporal" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}temporal" minOccurs="0"/>
 *               &lt;element name="map-key-enumerated" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}enumerated" minOccurs="0"/>
 *               &lt;sequence>
 *                 &lt;element name="map-key-attribute-override" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}attribute-override" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element name="map-key-convert" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}convert" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;/sequence>
 *             &lt;/choice>
 *             &lt;choice>
 *               &lt;element name="map-key-column" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}map-key-column" minOccurs="0"/>
 *               &lt;sequence>
 *                 &lt;element name="map-key-join-column" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}map-key-join-column" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element name="map-key-foreign-key" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}foreign-key" minOccurs="0"/>
 *               &lt;/sequence>
 *             &lt;/choice>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="column" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}column" minOccurs="0"/>
 *             &lt;choice>
 *               &lt;element name="temporal" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}temporal" minOccurs="0"/>
 *               &lt;element name="enumerated" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}enumerated" minOccurs="0"/>
 *               &lt;element name="lob" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}lob" minOccurs="0"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="attribute-override" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}attribute-override" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="association-override" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}association-override" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="convert" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}convert" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="collection-table" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}collection-table" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="target-class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fetch" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}fetch-type" />
 *       &lt;attribute name="access" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}access-type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "element-collection", propOrder = {
    "orderBy",
    "orderColumn",
    "mapKey",
    "mapKeyClass",
    "mapKeyTemporal",
    "mapKeyEnumerated",
    "mapKeyAttributeOverride",
    "mapKeyConvert",
    "mapKeyColumn",
    "mapKeyJoinColumn",
    "mapKeyForeignKey",
    "column",
    "temporal",
    "enumerated",
    "lob",
    "attributeOverride",
    "associationOverride",
    "convert",
    "collectionTable"
})
/**
 * For Basic ElementCollection    -> TargetClass<String>
 * For Embeddable ElementCollection -> ConnectedClass<Embeddable>
 */
public class ElementCollection extends CompositionAttribute implements FetchTypeHandler, ColumnHandler, AttributeOverrideHandler, AssociationOverrideHandler, CollectionTypeHandler { //CompositionAttribute/BaseAttributes

    @XmlElement(name = "order-by")
    protected String orderBy;
    @XmlElement(name = "order-column")
    protected OrderColumn orderColumn;//REVENG PENDING
    @XmlElement(name = "map-key")
    protected MapKey mapKey;//REVENG PENDING
    @XmlElement(name = "map-key-class")
    protected MapKeyClass mapKeyClass;//REVENG PENDING
    @XmlElement(name = "map-key-temporal")
    protected TemporalType mapKeyTemporal;//REVENG PENDING
    @XmlElement(name = "map-key-enumerated")
    protected EnumType mapKeyEnumerated;//REVENG PENDING
    @XmlElement(name = "map-key-attribute-override")
    protected Set<AttributeOverride> mapKeyAttributeOverride;//REVENG PENDING
    @XmlElement(name = "map-key-convert")
    protected List<Convert> mapKeyConvert;//REVENG PENDING
    @XmlElement(name = "map-key-column")
    protected MapKeyColumn mapKeyColumn;//REVENG PENDING
    @XmlElement(name = "map-key-join-column")
    protected List<MapKeyJoinColumn> mapKeyJoinColumn;//REVENG PENDING
    @XmlElement(name = "map-key-foreign-key")
    protected ForeignKey mapKeyForeignKey;//REVENG PENDING
    protected Column column;
    protected TemporalType temporal;
    protected EnumType enumerated;
    protected Lob lob;
    @XmlElement(name = "attribute-override")
    protected Set<AttributeOverride> attributeOverride;
    @XmlElement(name = "association-override")
    protected Set<AssociationOverride> associationOverride;
    protected List<Convert> convert;//REVENG PENDING
    @XmlElement(name = "collection-table")
    protected CollectionTable collectionTable;

    @XmlAttribute(name = "target-class")
    protected String targetClass;
    @XmlAttribute(name = "fetch")
    protected FetchType fetch;
    @XmlAttribute(name = "access")
    protected AccessType access;

    @XmlAttribute(name = "collection-type")
    private String collectionType;//custom added

    public static ElementCollection load(EntityMappings entityMappings, Element element, VariableElement variableElement) {
        AnnotationMirror annotationMirror = JavaSourceParserUtil.getAnnotation(element, "javax.persistence.ElementCollection");
        ElementCollection elementCollection = new ElementCollection();
        elementCollection.setId(NBModelerUtil.getAutoGeneratedStringId());
        elementCollection.column = Column.load(element);
        elementCollection.temporal = TemporalType.load(element, variableElement);
        elementCollection.enumerated = EnumType.load(element, variableElement);
        elementCollection.lob = Lob.load(element, variableElement);

        elementCollection.getAttributeOverride().addAll(AttributeOverride.load(element));
        elementCollection.getAssociationOverride().addAll(AssociationOverride.load(element));

        elementCollection.collectionTable = CollectionTable.load(element, variableElement);
        elementCollection.name = variableElement.getSimpleName().toString();

        AnnotationMirror orderByMirror = JavaSourceParserUtil.findAnnotation(element, "javax.persistence.OrderBy");
        if (orderByMirror != null) {
            Object value = JavaSourceParserUtil.findAnnotationValue(orderByMirror, "value");
            elementCollection.orderBy = value == null ? StringUtils.EMPTY : value.toString();
        }

        elementCollection.fetch = FetchType.load(element, annotationMirror);
        elementCollection.access = AccessType.load(element);

        elementCollection.collectionType = ((DeclaredType) variableElement.asType()).asElement().toString();

        DeclaredType declaredType = (DeclaredType) JavaSourceParserUtil.findAnnotationValue(annotationMirror, "targetClass");
        if (declaredType == null) {
            declaredType = (DeclaredType) ((DeclaredType) variableElement.asType()).getTypeArguments().get(0);
        }
        if (declaredType != null) {
            /* Embeddable Start*/
            if (JavaSourceParserUtil.isEmbeddableClass(declaredType.asElement())) {
                org.netbeans.jpa.modeler.spec.Embeddable embeddableClassSpec = entityMappings.findEmbeddable(elementCollection.targetClass);
                if (embeddableClassSpec == null) {
                    boolean fieldAccess = false;
                    if (element == variableElement) {
                        fieldAccess = true;
                    }
                    embeddableClassSpec = new org.netbeans.jpa.modeler.spec.Embeddable();
                    TypeElement embeddableTypeElement = JavaSourceParserUtil.getCollectionTypeElement(variableElement);
                    embeddableClassSpec.load(entityMappings, embeddableTypeElement, fieldAccess);
                    entityMappings.addEmbeddable(embeddableClassSpec);
                }
                elementCollection.setConnectedClass(embeddableClassSpec);
            }
            /* Embeddable End*/
        } else {
            elementCollection.setTargetClass("java.lang.String");//elementCollection.targetClass
        }
        JavaSourceParserUtil.addNonEEAnnotation(elementCollection, element);

        return elementCollection;
    }
    
    
     void beforeMarshal(Marshaller marshaller) {
        AttributeValidator.filter(this);
        AssociationValidator.filter(this);
    }

    /**
     * Gets the value of the orderBy property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the orderColumn property.
     *
     * @return possible object is {@link OrderColumn }
     *
     */
    public OrderColumn getOrderColumn() {
        return orderColumn;
    }

    /**
     * Sets the value of the orderColumn property.
     *
     * @param value allowed object is {@link OrderColumn }
     *
     */
    public void setOrderColumn(OrderColumn value) {
        this.orderColumn = value;
    }

    /**
     * Gets the value of the mapKey property.
     *
     * @return possible object is {@link MapKey }
     *
     */
    public MapKey getMapKey() {
        return mapKey;
    }

    /**
     * Sets the value of the mapKey property.
     *
     * @param value allowed object is {@link MapKey }
     *
     */
    public void setMapKey(MapKey value) {
        this.mapKey = value;
    }

    /**
     * Gets the value of the mapKeyClass property.
     *
     * @return possible object is {@link MapKeyClass }
     *
     */
    public MapKeyClass getMapKeyClass() {
        return mapKeyClass;
    }

    /**
     * Sets the value of the mapKeyClass property.
     *
     * @param value allowed object is {@link MapKeyClass }
     *
     */
    public void setMapKeyClass(MapKeyClass value) {
        this.mapKeyClass = value;
    }

    /**
     * Gets the value of the mapKeyTemporal property.
     *
     * @return possible object is {@link TemporalType }
     *
     */
    public TemporalType getMapKeyTemporal() {
        return mapKeyTemporal;
    }

    /**
     * Sets the value of the mapKeyTemporal property.
     *
     * @param value allowed object is {@link TemporalType }
     *
     */
    public void setMapKeyTemporal(TemporalType value) {
        this.mapKeyTemporal = value;
    }

    /**
     * Gets the value of the mapKeyEnumerated property.
     *
     * @return possible object is {@link EnumType }
     *
     */
    public EnumType getMapKeyEnumerated() {
        return mapKeyEnumerated;
    }

    /**
     * Sets the value of the mapKeyEnumerated property.
     *
     * @param value allowed object is {@link EnumType }
     *
     */
    public void setMapKeyEnumerated(EnumType value) {
        this.mapKeyEnumerated = value;
    }

    /**
     * Gets the value of the mapKeyAttributeOverride property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the mapKeyAttributeOverride property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapKeyAttributeOverride().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeOverride }
     *
     *
     * @return
     */
    public Set<AttributeOverride> getMapKeyAttributeOverride() {
        if (mapKeyAttributeOverride == null) {
            mapKeyAttributeOverride = new TreeSet<AttributeOverride>();
        }
        return this.mapKeyAttributeOverride;
    }

    /**
     * Gets the value of the mapKeyConvert property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the mapKeyConvert property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapKeyConvert().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Convert }
     *
     *
     */
    public List<Convert> getMapKeyConvert() {
        if (mapKeyConvert == null) {
            mapKeyConvert = new ArrayList<Convert>();
        }
        return this.mapKeyConvert;
    }

    /**
     * Gets the value of the mapKeyColumn property.
     *
     * @return possible object is {@link MapKeyColumn }
     *
     */
    public MapKeyColumn getMapKeyColumn() {
        return mapKeyColumn;
    }

    /**
     * Sets the value of the mapKeyColumn property.
     *
     * @param value allowed object is {@link MapKeyColumn }
     *
     */
    public void setMapKeyColumn(MapKeyColumn value) {
        this.mapKeyColumn = value;
    }

    /**
     * Gets the value of the mapKeyJoinColumn property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the mapKeyJoinColumn property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapKeyJoinColumn().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapKeyJoinColumn }
     *
     *
     */
    public List<MapKeyJoinColumn> getMapKeyJoinColumn() {
        if (mapKeyJoinColumn == null) {
            mapKeyJoinColumn = new ArrayList<MapKeyJoinColumn>();
        }
        return this.mapKeyJoinColumn;
    }

    /**
     * Gets the value of the mapKeyForeignKey property.
     *
     * @return possible object is {@link ForeignKey }
     *
     */
    public ForeignKey getMapKeyForeignKey() {
        return mapKeyForeignKey;
    }

    /**
     * Sets the value of the mapKeyForeignKey property.
     *
     * @param value allowed object is {@link ForeignKey }
     *
     */
    public void setMapKeyForeignKey(ForeignKey value) {
        this.mapKeyForeignKey = value;
    }

    /**
     * Gets the value of the column property.
     *
     * @return possible object is {@link Column }
     *
     */
    public Column getColumn() {
        if (column == null) {
            column = new Column();
        }
        return column;
    }

    /**
     * Sets the value of the column property.
     *
     * @param value allowed object is {@link Column }
     *
     */
    public void setColumn(Column value) {
        this.column = value;
    }

    /**
     * Gets the value of the temporal property.
     *
     * @return possible object is {@link TemporalType }
     *
     */
    public TemporalType getTemporal() {
        return temporal;
    }

    /**
     * Sets the value of the temporal property.
     *
     * @param value allowed object is {@link TemporalType }
     *
     */
    public void setTemporal(TemporalType value) {
        this.temporal = value;
    }

    /**
     * Gets the value of the enumerated property.
     *
     * @return possible object is {@link EnumType }
     *
     */
    public EnumType getEnumerated() {
        return enumerated;
    }

    /**
     * Sets the value of the enumerated property.
     *
     * @param value allowed object is {@link EnumType }
     *
     */
    public void setEnumerated(EnumType value) {
        this.enumerated = value;
    }

    /**
     * Gets the value of the lob property.
     *
     * @return possible object is {@link Lob }
     *
     */
    public Lob getLob() {
        return lob;
    }

    /**
     * Sets the value of the lob property.
     *
     * @param value allowed object is {@link Lob }
     *
     */
    public void setLob(Lob value) {
        this.lob = value;
    }

    /**
     * Gets the value of the attributeOverride property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the attributeOverride property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeOverride().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeOverride }
     *
     *
     */
    @Override
    public Set<AttributeOverride> getAttributeOverride() {
        if (attributeOverride == null) {
            attributeOverride = new TreeSet<AttributeOverride>();
        }
        return this.attributeOverride;
    }

    /**
     * Gets the value of the associationOverride property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the associationOverride property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociationOverride().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationOverride }
     *
     *
     */
    @Override
    public Set<AssociationOverride> getAssociationOverride() {
        if (associationOverride == null) {
            associationOverride = new TreeSet<>();
        }
        return this.associationOverride;
    }

    /**
     * Gets the value of the convert property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the convert property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvert().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Convert }
     *
     *
     */
    public List<Convert> getConvert() {
        if (convert == null) {
            convert = new ArrayList<Convert>();
        }
        return this.convert;
    }

    /**
     * Gets the value of the collectionTable property.
     *
     * @return possible object is {@link CollectionTable }
     *
     */
    public CollectionTable getCollectionTable() {
        if (collectionTable == null) {
            collectionTable = new CollectionTable();
        }
        return collectionTable;
    }

    /**
     * Sets the value of the collectionTable property.
     *
     * @param value allowed object is {@link CollectionTable }
     *
     */
    public void setCollectionTable(CollectionTable value) {
        this.collectionTable = value;
    }

    /**
     * Gets the value of the targetClass property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTargetClass() {
        return targetClass;
    }

    /**
     * Sets the value of the targetClass property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTargetClass(String value) {
        this.targetClass = value;
    }

    /**
     * Gets the value of the fetch property.
     *
     * @return possible object is {@link FetchType }
     *
     */
    @Override
    public FetchType getFetch() {
        return fetch;
    }

    /**
     * Sets the value of the fetch property.
     *
     * @param value allowed object is {@link FetchType }
     *
     */
    @Override
    public void setFetch(FetchType value) {
        this.fetch = value;
    }

    /**
     * Gets the value of the access property.
     *
     * @return possible object is {@link AccessType }
     *
     */
    @Override
    public AccessType getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     *
     * @param value allowed object is {@link AccessType }
     *
     */
    @Override
    public void setAccess(AccessType value) {
        this.access = value;
    }

    /**
     * @return the collectionType
     */
    public String getCollectionType() {
        if (collectionType == null) {
            collectionType = "java.util.List";
        }
        return collectionType;
    }

    /**
     * @param collectionType the collectionType to set
     */
    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType;
    }

    @Override
    public AttributeOverride getAttributeOverride(String attributePath) {
        Set<AttributeOverride> attributeOverrides = getAttributeOverride();
        for (AttributeOverride attributeOverride_TMP : attributeOverrides) {
            if (attributeOverride_TMP.getName().equals(attributePath)) {
                return attributeOverride_TMP;
            }
        }
        AttributeOverride attributeOverride_TMP = new AttributeOverride();
        attributeOverride_TMP.setName(attributePath);
        attributeOverrides.add(attributeOverride_TMP);
        return attributeOverride_TMP;
    }

    @Override
    public AssociationOverride getAssociationOverride(String attributePath) {
        Set<AssociationOverride> associationOverrides = getAssociationOverride();
        for (AssociationOverride associationOverride_TMP : associationOverrides) {
            if (associationOverride_TMP.getName().equals(attributePath)) {
                return associationOverride_TMP;
            }
        }
        AssociationOverride attributeOverride_TMP = new AssociationOverride();
        attributeOverride_TMP.setName(attributePath);
        associationOverrides.add(attributeOverride_TMP);
        return attributeOverride_TMP;
    }

    @Override
    public List<JaxbVariableType> getJaxbVariableList() {
        if (this.getConnectedClass() != null) { //Embedded //Complex
            return super.getJaxbVariableList();
        } else { //Basic //Simple
            return Arrays.asList(JaxbVariableType.values());
        }
    }
    
    
    
    @Override
    public String getAttributeType() {
        return this.getConnectedClass() != null ? super.getAttributeType() : targetClass;
    }

    public boolean isPrecisionAttributeType() {
        if ("java.math.BigDecimal".equals(getAttributeType())) {
            return true;
        }
        return false;
    }

    public boolean isScaleAttributeType() {
        if ("java.math.BigDecimal".equals(getAttributeType())) {
            return true;
        }
        return false;
    }

    public String getDefaultColumnName() {
        return this.getName().toUpperCase();
    }

    public String getColumnName() {
        if (this.getColumn() != null && StringUtils.isNotBlank(this.getColumn().getName())) {
            return getColumn().getName();
        } else {
            return getDefaultColumnName();
        }
    }
}

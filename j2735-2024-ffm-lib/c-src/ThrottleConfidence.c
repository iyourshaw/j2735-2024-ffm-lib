/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "ThrottleConfidence.h"

/*
 * This type is implemented using NativeEnumerated,
 * so here we adjust the DEF accordingly.
 */
#if !defined(ASN_DISABLE_OER_SUPPORT)
static asn_oer_constraints_t asn_OER_type_ThrottleConfidence_constr_1 CC_NOTUSED = {
	{ 0, 0 },
	-1};
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
asn_per_constraints_t asn_PER_type_ThrottleConfidence_constr_1 CC_NOTUSED = {
	{ APC_CONSTRAINED,	 2,  2,  0,  3 }	/* (0..3) */,
	{ APC_UNCONSTRAINED,	-1, -1,  0,  0 },
	0, 0	/* No PER value map */
};
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
static const asn_INTEGER_enum_map_t asn_MAP_ThrottleConfidence_value2enum_1[] = {
	{ 0,	11,	"unavailable" },
	{ 1,	13,	"prec10percent" },
	{ 2,	12,	"prec1percent" },
	{ 3,	14,	"prec0-5percent" }
};
static const unsigned int asn_MAP_ThrottleConfidence_enum2value_1[] = {
	3,	/* prec0-5percent(3) */
	1,	/* prec10percent(1) */
	2,	/* prec1percent(2) */
	0	/* unavailable(0) */
};
const asn_INTEGER_specifics_t asn_SPC_ThrottleConfidence_specs_1 = {
	asn_MAP_ThrottleConfidence_value2enum_1,	/* "tag" => N; sorted by tag */
	asn_MAP_ThrottleConfidence_enum2value_1,	/* N => "tag"; sorted by N */
	4,	/* Number of elements in the maps */
	0,	/* Enumeration is not extensible */
	1,	/* Strict enumeration */
	0,	/* Native long size */
	0
};
static const ber_tlv_tag_t asn_DEF_ThrottleConfidence_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (10 << 2))
};
asn_TYPE_descriptor_t asn_DEF_ThrottleConfidence = {
	"ThrottleConfidence",
	"ThrottleConfidence",
	&asn_OP_NativeEnumerated,
	asn_DEF_ThrottleConfidence_tags_1,
	sizeof(asn_DEF_ThrottleConfidence_tags_1)
		/sizeof(asn_DEF_ThrottleConfidence_tags_1[0]), /* 1 */
	asn_DEF_ThrottleConfidence_tags_1,	/* Same as above */
	sizeof(asn_DEF_ThrottleConfidence_tags_1)
		/sizeof(asn_DEF_ThrottleConfidence_tags_1[0]), /* 1 */
	{
#if !defined(ASN_DISABLE_OER_SUPPORT)
		&asn_OER_type_ThrottleConfidence_constr_1,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
		&asn_PER_type_ThrottleConfidence_constr_1,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
		NativeEnumerated_constraint
	},
	0, 0,	/* Defined elsewhere */
	&asn_SPC_ThrottleConfidence_specs_1	/* Additional specs */
};


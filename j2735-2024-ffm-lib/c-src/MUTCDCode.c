/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TravelerInformation"
 * 	found in "asn/J2735-TravelerInformation-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "MUTCDCode.h"

/*
 * This type is implemented using NativeEnumerated,
 * so here we adjust the DEF accordingly.
 */
#if !defined(ASN_DISABLE_OER_SUPPORT)
static asn_oer_constraints_t asn_OER_type_MUTCDCode_constr_1 CC_NOTUSED = {
	{ 0, 0 },
	-1};
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
asn_per_constraints_t asn_PER_type_MUTCDCode_constr_1 CC_NOTUSED = {
	{ APC_CONSTRAINED | APC_EXTENSIBLE,  3,  3,  0,  6 }	/* (0..6,...) */,
	{ APC_UNCONSTRAINED,	-1, -1,  0,  0 },
	0, 0	/* No PER value map */
};
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
static const asn_INTEGER_enum_map_t asn_MAP_MUTCDCode_value2enum_1[] = {
	{ 0,	4,	"none" },
	{ 1,	10,	"regulatory" },
	{ 2,	7,	"warning" },
	{ 3,	11,	"maintenance" },
	{ 4,	15,	"motoristService" },
	{ 5,	5,	"guide" },
	{ 6,	3,	"rec" }
	/* This list is extensible */
};
static const unsigned int asn_MAP_MUTCDCode_enum2value_1[] = {
	5,	/* guide(5) */
	3,	/* maintenance(3) */
	4,	/* motoristService(4) */
	0,	/* none(0) */
	6,	/* rec(6) */
	1,	/* regulatory(1) */
	2	/* warning(2) */
	/* This list is extensible */
};
const asn_INTEGER_specifics_t asn_SPC_MUTCDCode_specs_1 = {
	asn_MAP_MUTCDCode_value2enum_1,	/* "tag" => N; sorted by tag */
	asn_MAP_MUTCDCode_enum2value_1,	/* N => "tag"; sorted by N */
	7,	/* Number of elements in the maps */
	8,	/* Extensions before this member */
	1,	/* Strict enumeration */
	0,	/* Native long size */
	0
};
static const ber_tlv_tag_t asn_DEF_MUTCDCode_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (10 << 2))
};
asn_TYPE_descriptor_t asn_DEF_MUTCDCode = {
	"MUTCDCode",
	"MUTCDCode",
	&asn_OP_NativeEnumerated,
	asn_DEF_MUTCDCode_tags_1,
	sizeof(asn_DEF_MUTCDCode_tags_1)
		/sizeof(asn_DEF_MUTCDCode_tags_1[0]), /* 1 */
	asn_DEF_MUTCDCode_tags_1,	/* Same as above */
	sizeof(asn_DEF_MUTCDCode_tags_1)
		/sizeof(asn_DEF_MUTCDCode_tags_1[0]), /* 1 */
	{
#if !defined(ASN_DISABLE_OER_SUPPORT)
		&asn_OER_type_MUTCDCode_constr_1,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
		&asn_PER_type_MUTCDCode_constr_1,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
		NativeEnumerated_constraint
	},
	0, 0,	/* Defined elsewhere */
	&asn_SPC_MUTCDCode_specs_1	/* Additional specs */
};


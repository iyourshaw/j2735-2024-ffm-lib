/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadWeatherMessage"
 * 	found in "asn/J2945-3-RoadWeatherMessage-2024-rel-v2.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "NTCIPEssVisibilitySituation.h"

/*
 * This type is implemented using NativeEnumerated,
 * so here we adjust the DEF accordingly.
 */
#if !defined(ASN_DISABLE_OER_SUPPORT)
static asn_oer_constraints_t asn_OER_type_NTCIPEssVisibilitySituation_constr_1 CC_NOTUSED = {
	{ 0, 0 },
	-1};
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
asn_per_constraints_t asn_PER_type_NTCIPEssVisibilitySituation_constr_1 CC_NOTUSED = {
	{ APC_CONSTRAINED | APC_EXTENSIBLE,  4,  4,  0,  11 }	/* (0..11,...) */,
	{ APC_UNCONSTRAINED,	-1, -1,  0,  0 },
	0, 0	/* No PER value map */
};
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
static const asn_INTEGER_enum_map_t asn_MAP_NTCIPEssVisibilitySituation_value2enum_1[] = {
	{ 1,	5,	"other" },
	{ 2,	7,	"unknown" },
	{ 3,	5,	"clear" },
	{ 4,	12,	"fogNotPatchy" },
	{ 5,	9,	"patchyFog" },
	{ 6,	11,	"blowingSnow" },
	{ 7,	5,	"smoke" },
	{ 8,	8,	"seaSpray" },
	{ 9,	12,	"vehicleSpray" },
	{ 10,	17,	"blowingDustOrSand" },
	{ 11,	8,	"sunGlare" },
	{ 12,	15,	"swarmsOfInsects" }
	/* This list is extensible */
};
static const unsigned int asn_MAP_NTCIPEssVisibilitySituation_enum2value_1[] = {
	9,	/* blowingDustOrSand(10) */
	5,	/* blowingSnow(6) */
	2,	/* clear(3) */
	3,	/* fogNotPatchy(4) */
	0,	/* other(1) */
	4,	/* patchyFog(5) */
	7,	/* seaSpray(8) */
	6,	/* smoke(7) */
	10,	/* sunGlare(11) */
	11,	/* swarmsOfInsects(12) */
	1,	/* unknown(2) */
	8	/* vehicleSpray(9) */
	/* This list is extensible */
};
const asn_INTEGER_specifics_t asn_SPC_NTCIPEssVisibilitySituation_specs_1 = {
	asn_MAP_NTCIPEssVisibilitySituation_value2enum_1,	/* "tag" => N; sorted by tag */
	asn_MAP_NTCIPEssVisibilitySituation_enum2value_1,	/* N => "tag"; sorted by N */
	12,	/* Number of elements in the maps */
	13,	/* Extensions before this member */
	1,	/* Strict enumeration */
	0,	/* Native long size */
	0
};
static const ber_tlv_tag_t asn_DEF_NTCIPEssVisibilitySituation_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (10 << 2))
};
asn_TYPE_descriptor_t asn_DEF_NTCIPEssVisibilitySituation = {
	"NTCIPEssVisibilitySituation",
	"NTCIPEssVisibilitySituation",
	&asn_OP_NativeEnumerated,
	asn_DEF_NTCIPEssVisibilitySituation_tags_1,
	sizeof(asn_DEF_NTCIPEssVisibilitySituation_tags_1)
		/sizeof(asn_DEF_NTCIPEssVisibilitySituation_tags_1[0]), /* 1 */
	asn_DEF_NTCIPEssVisibilitySituation_tags_1,	/* Same as above */
	sizeof(asn_DEF_NTCIPEssVisibilitySituation_tags_1)
		/sizeof(asn_DEF_NTCIPEssVisibilitySituation_tags_1[0]), /* 1 */
	{
#if !defined(ASN_DISABLE_OER_SUPPORT)
		&asn_OER_type_NTCIPEssVisibilitySituation_constr_1,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
		&asn_PER_type_NTCIPEssVisibilitySituation_constr_1,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
		NativeEnumerated_constraint
	},
	0, 0,	/* Defined elsewhere */
	&asn_SPC_NTCIPEssVisibilitySituation_specs_1	/* Additional specs */
};


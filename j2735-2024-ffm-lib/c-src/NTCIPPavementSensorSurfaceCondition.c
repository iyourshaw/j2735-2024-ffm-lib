/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadWeatherMessage"
 * 	found in "asn/J2945-3-RoadWeatherMessage-2024-rel-v2.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "NTCIPPavementSensorSurfaceCondition.h"

/*
 * This type is implemented using NativeEnumerated,
 * so here we adjust the DEF accordingly.
 */
#if !defined(ASN_DISABLE_OER_SUPPORT)
static asn_oer_constraints_t asn_OER_type_NTCIPPavementSensorSurfaceCondition_constr_1 CC_NOTUSED = {
	{ 0, 0 },
	-1};
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
asn_per_constraints_t asn_PER_type_NTCIPPavementSensorSurfaceCondition_constr_1 CC_NOTUSED = {
	{ APC_CONSTRAINED | APC_EXTENSIBLE,  4,  4,  0,  12 }	/* (0..12,...) */,
	{ APC_UNCONSTRAINED,	-1, -1,  0,  0 },
	0, 0	/* No PER value map */
};
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
static const asn_INTEGER_enum_map_t asn_MAP_NTCIPPavementSensorSurfaceCondition_value2enum_1[] = {
	{ 1,	5,	"other" },
	{ 2,	5,	"error" },
	{ 3,	3,	"dry" },
	{ 4,	5,	"moist" },
	{ 5,	15,	"chemicallyMoist" },
	{ 6,	3,	"wet" },
	{ 7,	13,	"chemicallyWet" },
	{ 8,	13,	"standingWater" },
	{ 9,	5,	"frost" },
	{ 10,	5,	"slush" },
	{ 11,	4,	"snow" },
	{ 12,	3,	"ice" },
	{ 13,	8,	"noReport" }
	/* This list is extensible */
};
static const unsigned int asn_MAP_NTCIPPavementSensorSurfaceCondition_enum2value_1[] = {
	4,	/* chemicallyMoist(5) */
	6,	/* chemicallyWet(7) */
	2,	/* dry(3) */
	1,	/* error(2) */
	8,	/* frost(9) */
	11,	/* ice(12) */
	3,	/* moist(4) */
	12,	/* noReport(13) */
	0,	/* other(1) */
	9,	/* slush(10) */
	10,	/* snow(11) */
	7,	/* standingWater(8) */
	5	/* wet(6) */
	/* This list is extensible */
};
const asn_INTEGER_specifics_t asn_SPC_NTCIPPavementSensorSurfaceCondition_specs_1 = {
	asn_MAP_NTCIPPavementSensorSurfaceCondition_value2enum_1,	/* "tag" => N; sorted by tag */
	asn_MAP_NTCIPPavementSensorSurfaceCondition_enum2value_1,	/* N => "tag"; sorted by N */
	13,	/* Number of elements in the maps */
	14,	/* Extensions before this member */
	1,	/* Strict enumeration */
	0,	/* Native long size */
	0
};
static const ber_tlv_tag_t asn_DEF_NTCIPPavementSensorSurfaceCondition_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (10 << 2))
};
asn_TYPE_descriptor_t asn_DEF_NTCIPPavementSensorSurfaceCondition = {
	"NTCIPPavementSensorSurfaceCondition",
	"NTCIPPavementSensorSurfaceCondition",
	&asn_OP_NativeEnumerated,
	asn_DEF_NTCIPPavementSensorSurfaceCondition_tags_1,
	sizeof(asn_DEF_NTCIPPavementSensorSurfaceCondition_tags_1)
		/sizeof(asn_DEF_NTCIPPavementSensorSurfaceCondition_tags_1[0]), /* 1 */
	asn_DEF_NTCIPPavementSensorSurfaceCondition_tags_1,	/* Same as above */
	sizeof(asn_DEF_NTCIPPavementSensorSurfaceCondition_tags_1)
		/sizeof(asn_DEF_NTCIPPavementSensorSurfaceCondition_tags_1[0]), /* 1 */
	{
#if !defined(ASN_DISABLE_OER_SUPPORT)
		&asn_OER_type_NTCIPPavementSensorSurfaceCondition_constr_1,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
		&asn_PER_type_NTCIPPavementSensorSurfaceCondition_constr_1,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
		NativeEnumerated_constraint
	},
	0, 0,	/* Defined elsewhere */
	&asn_SPC_NTCIPPavementSensorSurfaceCondition_specs_1	/* Additional specs */
};


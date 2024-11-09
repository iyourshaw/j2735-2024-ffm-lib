/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ProbeVehicleData"
 * 	found in "asn/J2735-ProbeVehicleData-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "WheelEndElectFault.h"

/*
 * This type is implemented using NativeEnumerated,
 * so here we adjust the DEF accordingly.
 */
#if !defined(ASN_DISABLE_OER_SUPPORT)
static asn_oer_constraints_t asn_OER_type_WheelEndElectFault_constr_1 CC_NOTUSED = {
	{ 0, 0 },
	-1};
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
asn_per_constraints_t asn_PER_type_WheelEndElectFault_constr_1 CC_NOTUSED = {
	{ APC_CONSTRAINED,	 2,  2,  0,  3 }	/* (0..3) */,
	{ APC_UNCONSTRAINED,	-1, -1,  0,  0 },
	0, 0	/* No PER value map */
};
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
static const asn_INTEGER_enum_map_t asn_MAP_WheelEndElectFault_value2enum_1[] = {
	{ 0,	4,	"isOk" },
	{ 1,	12,	"isNotDefined" },
	{ 2,	7,	"isError" },
	{ 3,	14,	"isNotSupported" }
};
static const unsigned int asn_MAP_WheelEndElectFault_enum2value_1[] = {
	2,	/* isError(2) */
	1,	/* isNotDefined(1) */
	3,	/* isNotSupported(3) */
	0	/* isOk(0) */
};
const asn_INTEGER_specifics_t asn_SPC_WheelEndElectFault_specs_1 = {
	asn_MAP_WheelEndElectFault_value2enum_1,	/* "tag" => N; sorted by tag */
	asn_MAP_WheelEndElectFault_enum2value_1,	/* N => "tag"; sorted by N */
	4,	/* Number of elements in the maps */
	0,	/* Enumeration is not extensible */
	1,	/* Strict enumeration */
	0,	/* Native long size */
	0
};
static const ber_tlv_tag_t asn_DEF_WheelEndElectFault_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (10 << 2))
};
asn_TYPE_descriptor_t asn_DEF_WheelEndElectFault = {
	"WheelEndElectFault",
	"WheelEndElectFault",
	&asn_OP_NativeEnumerated,
	asn_DEF_WheelEndElectFault_tags_1,
	sizeof(asn_DEF_WheelEndElectFault_tags_1)
		/sizeof(asn_DEF_WheelEndElectFault_tags_1[0]), /* 1 */
	asn_DEF_WheelEndElectFault_tags_1,	/* Same as above */
	sizeof(asn_DEF_WheelEndElectFault_tags_1)
		/sizeof(asn_DEF_WheelEndElectFault_tags_1[0]), /* 1 */
	{
#if !defined(ASN_DISABLE_OER_SUPPORT)
		&asn_OER_type_WheelEndElectFault_constr_1,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
		&asn_PER_type_WheelEndElectFault_constr_1,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
		NativeEnumerated_constraint
	},
	0, 0,	/* Defined elsewhere */
	&asn_SPC_WheelEndElectFault_specs_1	/* Additional specs */
};


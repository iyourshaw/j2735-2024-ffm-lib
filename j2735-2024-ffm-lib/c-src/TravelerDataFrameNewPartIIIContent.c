/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TravelerInformation"
 * 	found in "asn/J2735-TravelerInformation-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "TravelerDataFrameNewPartIIIContent.h"

#if !defined(ASN_DISABLE_OER_SUPPORT)
static asn_oer_constraints_t asn_OER_type_TravelerDataFrameNewPartIIIContent_constr_1 CC_NOTUSED = {
	{ 0, 0 },
	-1};
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
asn_per_constraints_t asn_PER_type_TravelerDataFrameNewPartIIIContent_constr_1 CC_NOTUSED = {
	{ APC_CONSTRAINED | APC_EXTENSIBLE,  0,  0,  0,  0 }	/* (0..0,...) */,
	{ APC_UNCONSTRAINED,	-1, -1,  0,  0 },
	0, 0	/* No PER value map */
};
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
asn_TYPE_member_t asn_MBR_TravelerDataFrameNewPartIIIContent_1[] = {
	{ ATF_NOFLAGS, 0, offsetof(struct TravelerDataFrameNewPartIIIContent, choice.frictionInfo),
		(ASN_TAG_CLASS_CONTEXT | (0 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_FrictionInformation,
		0,
		{
#if !defined(ASN_DISABLE_OER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
			0
		},
		0, 0, /* No default value */
		"frictionInfo"
		},
};
static const asn_TYPE_tag2member_t asn_MAP_TravelerDataFrameNewPartIIIContent_tag2el_1[] = {
    { (ASN_TAG_CLASS_CONTEXT | (0 << 2)), 0, 0, 0 } /* frictionInfo */
};
asn_CHOICE_specifics_t asn_SPC_TravelerDataFrameNewPartIIIContent_specs_1 = {
	sizeof(struct TravelerDataFrameNewPartIIIContent),
	offsetof(struct TravelerDataFrameNewPartIIIContent, _asn_ctx),
	offsetof(struct TravelerDataFrameNewPartIIIContent, present),
	sizeof(((struct TravelerDataFrameNewPartIIIContent *)0)->present),
	asn_MAP_TravelerDataFrameNewPartIIIContent_tag2el_1,
	1,	/* Count of tags in the map */
	0, 0,
	1	/* Extensions start */
};
asn_TYPE_descriptor_t asn_DEF_TravelerDataFrameNewPartIIIContent = {
	"TravelerDataFrameNewPartIIIContent",
	"TravelerDataFrameNewPartIIIContent",
	&asn_OP_CHOICE,
	0,	/* No effective tags (pointer) */
	0,	/* No effective tags (count) */
	0,	/* No tags (pointer) */
	0,	/* No tags (count) */
	{
#if !defined(ASN_DISABLE_OER_SUPPORT)
		&asn_OER_type_TravelerDataFrameNewPartIIIContent_constr_1,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
		&asn_PER_type_TravelerDataFrameNewPartIIIContent_constr_1,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
		CHOICE_constraint
	},
	asn_MBR_TravelerDataFrameNewPartIIIContent_1,
	1,	/* Elements count */
	&asn_SPC_TravelerDataFrameNewPartIIIContent_specs_1	/* Additional specs */
};


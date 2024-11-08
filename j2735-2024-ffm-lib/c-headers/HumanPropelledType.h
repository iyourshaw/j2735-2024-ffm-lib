/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "PersonalSafetyMessage"
 * 	found in "asn/J2735-PersonalSafetyMessage-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_HumanPropelledType_H_
#define	_HumanPropelledType_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum HumanPropelledType {
	HumanPropelledType_unavailable	= 0,
	HumanPropelledType_otherTypes	= 1,
	HumanPropelledType_onFoot	= 2,
	HumanPropelledType_skateboard	= 3,
	HumanPropelledType_pushOrKickScooter	= 4,
	HumanPropelledType_wheelchair	= 5
	/*
	 * Enumeration is extensible
	 */
} e_HumanPropelledType;

/* HumanPropelledType */
typedef long	 HumanPropelledType_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_HumanPropelledType_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_HumanPropelledType;
extern const asn_INTEGER_specifics_t asn_SPC_HumanPropelledType_specs_1;
asn_struct_free_f HumanPropelledType_free;
asn_struct_print_f HumanPropelledType_print;
asn_constr_check_f HumanPropelledType_constraint;
ber_type_decoder_f HumanPropelledType_decode_ber;
der_type_encoder_f HumanPropelledType_encode_der;
xer_type_decoder_f HumanPropelledType_decode_xer;
xer_type_encoder_f HumanPropelledType_encode_xer;
jer_type_encoder_f HumanPropelledType_encode_jer;
oer_type_decoder_f HumanPropelledType_decode_oer;
oer_type_encoder_f HumanPropelledType_encode_oer;
per_type_decoder_f HumanPropelledType_decode_uper;
per_type_encoder_f HumanPropelledType_encode_uper;
per_type_decoder_f HumanPropelledType_decode_aper;
per_type_encoder_f HumanPropelledType_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _HumanPropelledType_H_ */
#include "asn_internal.h"

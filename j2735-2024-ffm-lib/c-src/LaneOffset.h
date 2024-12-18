/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ManeuverSharingAndCoordinatingMessage"
 * 	found in "asn/J3186-ManeuverSharingandCoordinatingMessage-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_LaneOffset_H_
#define	_LaneOffset_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum LaneOffset {
	LaneOffset_currentLane	= 0,
	LaneOffset_firstLeftLane	= 1,
	LaneOffset_firstRightLane	= 2,
	LaneOffset_secondLeftLane	= 3,
	LaneOffset_secondRightLane	= 4,
	LaneOffset_thirdLeftLane	= 5,
	LaneOffset_thirdRightLane	= 6
	/*
	 * Enumeration is extensible
	 */
} e_LaneOffset;

/* LaneOffset */
typedef long	 LaneOffset_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_LaneOffset_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_LaneOffset;
extern const asn_INTEGER_specifics_t asn_SPC_LaneOffset_specs_1;
asn_struct_free_f LaneOffset_free;
asn_struct_print_f LaneOffset_print;
asn_constr_check_f LaneOffset_constraint;
ber_type_decoder_f LaneOffset_decode_ber;
der_type_encoder_f LaneOffset_encode_der;
xer_type_decoder_f LaneOffset_decode_xer;
xer_type_encoder_f LaneOffset_encode_xer;
jer_type_encoder_f LaneOffset_encode_jer;
oer_type_decoder_f LaneOffset_decode_oer;
oer_type_encoder_f LaneOffset_encode_oer;
per_type_decoder_f LaneOffset_decode_uper;
per_type_encoder_f LaneOffset_encode_uper;
per_type_decoder_f LaneOffset_decode_aper;
per_type_encoder_f LaneOffset_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _LaneOffset_H_ */
#include "asn_internal.h"

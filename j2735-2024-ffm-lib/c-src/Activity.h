/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadSafetyMessage"
 * 	found in "asn/J2945-4-RoadSafetyMessage-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_Activity_H_
#define	_Activity_H_


#include "asn_application.h"

/* Including external dependencies */
#include "BOOLEAN.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Activity */
typedef BOOLEAN_t	 Activity_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_Activity;
asn_struct_free_f Activity_free;
asn_struct_print_f Activity_print;
asn_constr_check_f Activity_constraint;
ber_type_decoder_f Activity_decode_ber;
der_type_encoder_f Activity_encode_der;
xer_type_decoder_f Activity_decode_xer;
xer_type_encoder_f Activity_encode_xer;
jer_type_encoder_f Activity_encode_jer;
oer_type_decoder_f Activity_decode_oer;
oer_type_encoder_f Activity_encode_oer;
per_type_decoder_f Activity_decode_uper;
per_type_encoder_f Activity_encode_uper;
per_type_decoder_f Activity_decode_aper;
per_type_encoder_f Activity_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _Activity_H_ */
#include "asn_internal.h"

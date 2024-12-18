/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TollUsageMessage"
 * 	found in "asn/J3217-TollUsageMsg-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_EncryptedTumData_H_
#define	_EncryptedTumData_H_


#include "asn_application.h"

/* Including external dependencies */
#include "OCTET_STRING.h"

#ifdef __cplusplus
extern "C" {
#endif

/* EncryptedTumData */
typedef OCTET_STRING_t	 EncryptedTumData_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_EncryptedTumData_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_EncryptedTumData;
asn_struct_free_f EncryptedTumData_free;
asn_struct_print_f EncryptedTumData_print;
asn_constr_check_f EncryptedTumData_constraint;
ber_type_decoder_f EncryptedTumData_decode_ber;
der_type_encoder_f EncryptedTumData_encode_der;
xer_type_decoder_f EncryptedTumData_decode_xer;
xer_type_encoder_f EncryptedTumData_encode_xer;
jer_type_encoder_f EncryptedTumData_encode_jer;
oer_type_decoder_f EncryptedTumData_decode_oer;
oer_type_encoder_f EncryptedTumData_encode_oer;
per_type_decoder_f EncryptedTumData_decode_uper;
per_type_encoder_f EncryptedTumData_encode_uper;
per_type_decoder_f EncryptedTumData_decode_aper;
per_type_encoder_f EncryptedTumData_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _EncryptedTumData_H_ */
#include "asn_internal.h"
